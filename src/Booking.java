import java.time.LocalDate;
import java.util.List;

public class Booking {
    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private TypeOfVacation typeOfVacation;
    private Room room;
    private Guest guest;

    private Guest guest2;

    private Guest guest3;

    private List<Guest> otherGuests;




    public Booking(int roomNumber, LocalDate checkIn, LocalDate checkOut, TypeOfVacation typeOfVacation, Room room, Guest guest) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
    }

    public Booking(int roomNumber, LocalDate checkIn, LocalDate checkOut, TypeOfVacation typeOfVacation, Room room, Guest guest, Guest guest2) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
        this.guest2 = guest2;
    }

    public Booking(int roomNumber, LocalDate checkIn, LocalDate checkOut, TypeOfVacation typeOfVacation, Room room, Guest guest, Guest guest2, Guest guest3) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
        this.guest2 = guest2;
        this.guest3 = guest3;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    public Guest getGuest2() {
        return guest2;
    }

    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
    }

    public Guest getGuest3() {
        return guest3;
    }

    public void setGuest3(Guest guest3) {
        this.guest3 = guest3;
    }
}
