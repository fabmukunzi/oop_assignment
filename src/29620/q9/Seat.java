package q9;

public class Seat extends Passenger {
  private String seatNumber;
  private String seatType;

  public String getSeatNumber() {
    return seatNumber;
  }

  public String getSeatType() {
    return seatType;
  }

  public Seat(
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
      String nationality,
      String seatNumber,
      String seatType)
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
        departureTime,
        passengerName,
        passportNumber,
        nationality);
    if (seatType == null || (!seatType.equals("Economy") && !seatType.equals("Business"))) {
      throw new AirlineException("Seat type must be Economy or Business.");
    }
    this.seatNumber = seatNumber;
    this.seatType = seatType;
  }
}
