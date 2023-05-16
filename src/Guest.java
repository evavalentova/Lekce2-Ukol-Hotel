import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String surname;
    private LocalDate birthDate;

    public Guest(String firstName, String surname, LocalDate birthDate) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static String getDescription(Guest guest) {
        return guest.getFirstName() + " " + guest.getSurname() + " " + guest.getBirthDate().getDayOfMonth() + "." + guest.getBirthDate().getMonthValue() + "." + guest.getBirthDate().getYear();
    }
}
