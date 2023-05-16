import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    public void printAllBookings() {
        for (Booking booking : bookings) {
            System.out.println("Rezervace na pokoj č. " + booking.getRoomNumber() + " od " + booking.getCheckIn() + " do " + booking.getCheckOut() + ", typ pobytu: " + booking.getTypeOfVacation() + " hosté: " + booking.getGuest());
        }
    }
}
