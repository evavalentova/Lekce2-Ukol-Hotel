import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        Booking firstBooking = new Booking(1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.REKREACNI, firstRoom, firstGuest);
        Booking secondBooking = new Booking(3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 16), TypeOfVacation.PRACOVNI, thirdRoom, firstGuest, secondGuest);


        Booking thirdBooking = new Booking(2, LocalDate.of(2022, 9, 1), LocalDate.of(2021, 9, 16), TypeOfVacation.PRACOVNI, secondRoom, firstGuest);

        ListOfBookings bookings = new ListOfBookings();

        List<Guest> otherGuests = new ArrayList<>();

        bookings.addBooking(firstBooking);
        bookings.addBooking(secondBooking);
        bookings.addBooking(thirdBooking);
        bookings.printAllBookings();

    }
}