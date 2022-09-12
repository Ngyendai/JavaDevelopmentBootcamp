package TheWorldOfObject.airline_reservation_system;

import java.util.Arrays;

public class Person {

  private String name;
  private String nationality;
  private String dateOfBirth;
  private int seatNumber;
  private String[] passport;

  public String[] getPassport() {
    return Arrays.copyOf(passport, this.passport.length);
  }

  public void setPassport() {
    this.passport =
      new String[] { this.name, this.nationality, this.dateOfBirth };
  }

  public Person(
    String name,
    String nationality,
    String dateOfBirth,
    int seatNumber
  ) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
    this.passport = new String[3];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  // String[] passport;

  public Person(Person source) {
    this.name = source.name;
    this.nationality = source.nationality;
    this.dateOfBirth = source.dateOfBirth;
    this.seatNumber = source.seatNumber;
    this.passport = Arrays.copyOf(source.passport, source.passport.length);
  }

  public boolean applyPassport() {
    // Random
    int number = (int) (Math.random() * 2);
    // Check if else
    if (number == 0) {
      return true;
    } else {
      return false;
    }
  }

  public void chooseSeat() {
    // Random
    this.seatNumber = (int) (Math.random() * 11 + 1);
  }

  public String toString() {
    return (
      "Name: " +
      this.name +
      "\n" +
      "Nationality: " +
      this.nationality +
      "\n" +
      "Date of Birth: " +
      this.dateOfBirth +
      "\n" +
      "Seat Number: " +
      this.seatNumber +
      "\n" +
      "Passport: " +
      Arrays.toString(this.passport) +
      "\n"
    );
  }
}
