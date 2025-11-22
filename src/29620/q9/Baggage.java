package q9;

public class Baggage extends Ticket {
  private double baggageWeight;
  private double baggageFee;

  public double getBaggageWeight() {
    return baggageWeight;
  }

  public double getBaggageFee() {
    return baggageFee;
  }

  public Baggage(
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
      double price,
      double baggageWeight,
      double baggageFee)
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
        seatType,
        ticketNumber,
        price);
    if (baggageWeight < 0 || baggageFee < 0) {
      throw new AirlineException("Baggage weight and fee must be >= 0.");
    }
    this.baggageWeight = baggageWeight;
    this.baggageFee = baggageFee;
  }
}
