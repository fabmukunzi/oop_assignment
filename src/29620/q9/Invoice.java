package q9;

public class Invoice extends Payment {
  private double totalFare;

  public double getTotalFare() {
    return totalFare;
  }

  public Invoice(
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
      double baggageFee,
      String paymentDate,
      String paymentMode,
      double totalFare)
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
        price,
        baggageWeight,
        baggageFee,
        paymentDate,
        paymentMode);
    if (totalFare <= 0) {
      throw new AirlineException("Total fare must be > 0.");
    }
    this.totalFare = totalFare;
  }
}
