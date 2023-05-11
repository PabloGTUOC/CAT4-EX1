import java.time.LocalDate;
package edu.uoc.pac4;
package edu.uoc.pac4.exception;

public class User {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Gender gender;
    private Address address;
    private double debt;

    public User(String name, String email, LocalDate birthDate, Gender gender, Address address) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.debt = 0;
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

    public void addDebt(double debt) throws UserException {
        if (debt <= 0) {
            throw new UserException(UserException.ERR_ADD_INVALID_DEBT_VALUE);
        }
        this.debt += debt;
    }

    public void resetDebt() {
        this.debt = 0;
    }

    public boolean isPremium() {
        // return true if the user is subscribed as premium
        // return false otherwise
    }

    public void subscribe() throws UserException {
        // subscribe the user as premium
        // throw a UserException with ERR_PREMIUM_SUBSCRIPTION message if the user cannot be subscribed as premium
    }

    public void unsubscribe() {
        // unsubscribe the user from premium
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
        // implement equals method
    }

    @Override
    public String toString() {
        // implement toString method
    }
}
