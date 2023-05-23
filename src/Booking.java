import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private TypeOfVacation typeOfVacation;
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests = new ArrayList<>();


    public Booking(LocalDate checkIn, LocalDate checkOut, TypeOfVacation typeOfVacation, Room room, Guest guest) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public void addGuest(Guest newOtherGuest) {
        otherGuests.add(newOtherGuest);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", typeOfVacation=" + typeOfVacation +
                ", room=" + room +
                ", guest=" + guest +
                ", otherGuests=" + otherGuests +
                '}';
    }
}
