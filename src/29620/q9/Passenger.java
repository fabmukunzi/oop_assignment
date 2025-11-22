package q9;

public class Passenger extends Flight {
  private String passengerName;
  private String passportNumber;
  private String nationality;

  public String getPassengerName() {
    return passengerName;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public String getNationality() {
    return nationality;
  }

  public Passenger(
      int id,
      String cDate,
      String uDate,
      String airlineName,
      String address,
      String contactEmail,
      String flightNumber,
      String destination,
      String departureTime,
      String passengerName,
      String passportNumber,
      String nationality)
      throws AirlineException {
    super(
        id,
        cDate,
        uDate,
        airlineName,
        address,
        contactEmail,
        flightNumber,
        destination,
        departureTime);
    if (passportNumber == null || passportNumber.isEmpty()) {
      throw new AirlineException("Passport number cannot be empty.");
    }
    this.passengerName = passengerName;
    this.passportNumber = passportNumber;
    this.nationality = nationality;
  }
}
