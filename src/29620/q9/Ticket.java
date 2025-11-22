package q9;

public class Ticket extends Seat {
  private String ticketNumber;
  private double price;

  public String getTicketNumber() {
    return ticketNumber;
  }

  public double getPrice() {
    return price;
  }

  public Ticket(
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
      String seatType,
      String ticketNumber,
      double price)
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
        nationality,
        seatNumber,
        seatType);
    if (price <= 0) {
      throw new AirlineException("Ticket price must be > 0.");
    }
    this.ticketNumber = ticketNumber;
    this.price = price;
  }
}
