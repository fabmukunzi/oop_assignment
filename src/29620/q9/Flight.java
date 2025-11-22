package q9;

public class Flight extends Airline {
  private String flightNumber;
  private String destination;
  private String departureTime;

  public String getFlightNumber() {
    return flightNumber;
  }

  public String getDestination() {
    return destination;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public Flight(
      int id,
      String cDate,
      String uDate,
      String airlineName,
      String address,
      String contactEmail,
      String flightNumber,
      String destination,
      String departureTime)
      throws AirlineException {
    super(id, cDate, uDate, airlineName, address, contactEmail);
    if (flightNumber == null
        || flightNumber.isEmpty()
        || destination == null
        || destination.isEmpty()
        || departureTime == null
        || departureTime.isEmpty()) {
      throw new AirlineException("Flight details cannot be empty.");
    }
    this.flightNumber = flightNumber;
    this.destination = destination;
    this.departureTime = departureTime;
  }
}
