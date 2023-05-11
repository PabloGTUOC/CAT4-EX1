import java.time.LocalDate;
import edu.uoc.pac4;

public class User {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Gender gender;
    private Address address;
    private double debt;
    private boolean isPremium;

    public User(String name, String email, LocalDate birthDate, Gender gender, Address address) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.debt = 0.0;
        this.isPremium = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void addDebt(double debt) {
        this.debt += debt;
    }

    public void resetDebt() {
        this.debt = 0.0;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void subscribe() {
        this.isPremium = true;
    }

    public void unsubscribe() {
        this.isPremium = false;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return name.equals(user.name) && email.equals(user.email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", address=" + address +
                ", debt=" + debt +
                ", isPremium=" + isPremium +
                '}';
    }
}