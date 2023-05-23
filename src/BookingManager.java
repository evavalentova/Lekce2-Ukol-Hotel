import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

//Třída pro správu rezervací

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    //1. Vložení rezervace do seznamu
    public void add(Booking newBooking) {
        bookings.add(newBooking);
    }

    //2. Získání seznamu rezervací
    public List<Booking> getBookings() {
        return bookings;
    }

    public void printAllBookings() {
        for (Booking booking : bookings) {
            System.out.println("Rezervace na pokoj č. " + booking.getRoom().getRoomNumber() + " od " + booking.getCheckIn() + " do " + booking.getCheckOut() + ", typ pobytu: " + booking.getTypeOfVacation() + ", hosté: " + booking.getGuest().getFirstName() + " " + booking.getGuest().getSurname() + " " + booking.getOtherGuests());
        }
    }
    @Override
    public String toString() {
        return "BookingManager{" +
                "bookings=" + bookings +
                '}';
    }

    //Metoda pro zjištění počtu rezervací celkem
    public int getNumberOfBookings() {
        return bookings.size();
    }

    //Metoda pro zjištění počtu pracovních pobytů
    public int getNumberOfWorkingBookings() {
        int result = 0;
        for (Booking booking : bookings) {
            if (booking.getTypeOfVacation() == TypeOfVacation.PRACOVNI) {
                result = result + 1;
            }
        }
        return result;
    }

    //Metoda - průměrný počet hostů na rezervaci
    public double getAverageNumberOfGuestsPerBooking() {
        int numberOfGuests = 0;
        for (Booking booking : bookings) {
            numberOfGuests = numberOfGuests + 1 + booking.getOtherGuests().size();
            }
         return (double) numberOfGuests / getNumberOfBookings();
        }

    //Metoda - prvních 8 rekreačních rezervací
    public void getFirstEightRecreationalBookings() {
        int numberOfRecreationalBookings = 0;
            for (Booking booking : bookings) {
                if(booking.getTypeOfVacation() == TypeOfVacation.REKREACNI) {
                    System.out.println(booking);
                    numberOfRecreationalBookings++;
                    if(numberOfRecreationalBookings == 8) {
                        break;
                    }
                }
            }
        }

    //Metoda pro zjištění počtu jednodenních, dvoudenních a vícedenních pobytů
    public String printLengthOfBookings() {
        int numberOfOneDayBookings = 0;
        int numberOfTwoDayBookings = 0;
        int numberOfMoreThenTwoDayBookings = 0;
        for (Booking booking : bookings) {
            LocalDate start = booking.getCheckIn();
            LocalDate end = booking.getCheckOut();
            long daysBetween = ChronoUnit.DAYS.between(start, end);
            if(daysBetween == 1) {
                numberOfOneDayBookings++;
            } else if (daysBetween == 2) {
                numberOfTwoDayBookings++;
            } else if (daysBetween > 2) {
                numberOfMoreThenTwoDayBookings++;
            }
        }
        return "Počet jednodenních pobytů: " + numberOfOneDayBookings + ". Počet dvoudenních pobytů: " + numberOfTwoDayBookings + ". Počet vícedenních pobytů: " + numberOfMoreThenTwoDayBookings + ".";
    }

    //Metoda pro získání ceny objednávek
    public void printPricePerBooking() {
        long numberOfDays = 0;
        String result = "";
        for (Booking booking : bookings) {
            numberOfDays = ChronoUnit.DAYS.between(booking.getCheckIn(), booking.getCheckOut());
            long pricePerBooking = numberOfDays * booking.getRoom().getPricePerNight();
            System.out.println(booking.getGuest().getFirstName() + " " + booking.getGuest().getSurname() + " (pokoj " + booking.getRoom().getRoomNumber() + "): " + numberOfDays + " noc/noci/nocí od " + booking.getCheckIn().getDayOfMonth() + "." + booking.getCheckIn().getMonthValue() + "." + booking.getCheckIn().getYear() + " za " + pricePerBooking + " Kč");
            }
        }
    }






