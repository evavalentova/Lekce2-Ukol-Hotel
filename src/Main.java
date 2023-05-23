import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(Guest.getDescription(firstGuest));
        System.out.println(Guest.getDescription(secondGuest));


        Room firstRoom = new Room(1, 1, true, true, 1000);
        Room secondRoom = new Room(2, 1, true, true, 1000);
        Room thirdRoom = new Room(3, 3, false, true, 2400);

        System.out.println(firstRoom);
        System.out.println(secondRoom);
        System.out.println(thirdRoom);


        Booking firstBooking = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.PRACOVNI, firstRoom, firstGuest);
        Booking secondBooking = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.REKREACNI, thirdRoom, firstGuest);

        BookingManager bookings = new BookingManager();

        bookings.add(firstBooking);
        bookings.add(secondBooking);
        secondBooking.addGuest(secondGuest);


        //Vytvoření testovacích dat
        //1. Karel Dvořák
        Guest thirdGuest = new Guest("Karel", "Dvořák", LocalDate.of(1990, 2, 3));
        Booking thirdBooking = new Booking(LocalDate.of(2023, 6, 1),LocalDate.of(2023, 6, 7), TypeOfVacation.PRACOVNI, thirdRoom, thirdGuest);
        
        //2. Cestovní kancelář ABC Relax
        Guest ckAbcRelax = new Guest("CK ABC", "Relax", null);
        LocalDate checkIn = LocalDate.of(2023,6,1);
        LocalDate checkOut = LocalDate.of(2023, 6, 2);
        for (int i = 0; i < 30; i++) {
            bookings.add(new Booking(checkIn, checkOut, TypeOfVacation.REKREACNI, secondRoom, ckAbcRelax));
            checkIn = checkIn.plusDays(1);
            checkOut = checkOut.plusDays(1);
        }

        //3. Alena Karasová
        Guest fourthGuest = new Guest("Alena", "Krásová", LocalDate.of(1988, 4, 3));
        LocalDate checkInAlena = LocalDate.of(2023, 6, 1);
        LocalDate checkOutAlena = LocalDate.of(2023, 6, 6);
        for (int i = 0; i < 7; i++) {
            bookings.add(new Booking(checkInAlena, checkOutAlena, TypeOfVacation.PRACOVNI, firstRoom, fourthGuest));
            checkInAlena = checkInAlena.plusMonths(1);
            checkOutAlena = checkOutAlena.plusMonths(1);
        }

        //4. CK ABC Relax
        LocalDate checkInAbc = LocalDate.of(2023, 8, 1);
        LocalDate checkOutAbc = LocalDate.of(2023, 8, 4);
        for(int i = 0; i < 4; i++) {
            bookings.add(new Booking(checkInAbc, checkOutAbc, TypeOfVacation.REKREACNI, secondRoom, ckAbcRelax));
            if (checkInAbc.getDayOfMonth() % 7 == 0) {
                checkInAbc = checkInAbc.plusWeeks(1);
            } else {
                checkInAbc = checkInAbc.plusWeeks(1).minusDays(1);
            }
            checkOutAbc = checkInAbc.plusDays(3);
        }

        //System.out.println(bookings.getBookings());
        bookings.printAllBookings();

        //Počet rezervací celkem
        System.out.println(bookings.getNumberOfBookings());

        //Počet pracovních pobytů
        System.out.println(bookings.getNumberOfWorkingBookings());

        //Průměrný počet hostů na rezervaci
        System.out.println(bookings.getAverageNumberOfGuestsPerBooking());

        //Prvních 8 rekreačních pobytů
        bookings.getFirstEightRecreationalBookings();

        //Počet jednodenních, dvoudenních a vícedenní pobytů
        System.out.println(bookings.printLengthOfBookings());

        //Cena objednávek
       bookings.printPricePerBooking();
    }
}