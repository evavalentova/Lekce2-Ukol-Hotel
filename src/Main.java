import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest secondGuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(Guest.getDescription(firstGuest));
        System.out.println(Guest.getDescription(secondGuest));


        Room firstRoom = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room secondRoom = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        Room thirdRoom = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

        System.out.println(firstRoom);
        System.out.println(secondRoom);
        System.out.println(thirdRoom);


        Booking firstBooking = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.PRACOVNI, firstRoom, firstGuest);
        Booking secondBooking = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.REKREACNI, thirdRoom, firstGuest);

        ListOfBookings bookings = new ListOfBookings();

        bookings.addBooking(firstBooking);
        bookings.addBooking(secondBooking);
        secondBooking.addGuest(secondGuest);

        bookings.printAllBookings();
    }
}