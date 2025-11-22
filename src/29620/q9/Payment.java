package q9;

public class Payment extends Baggage {
  private String paymentDate;
  private String paymentMode;

  public String getPaymentDate() {
    return paymentDate;
  }

  public String getPaymentMode() {
    return paymentMode;
  }

  public Payment(
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
      String paymentMode)
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
        baggageFee);
    if (paymentDate == null
        || paymentDate.isEmpty()
        || paymentMode == null
        || paymentMode.isEmpty()) {
      throw new AirlineException("Payment date and mode cannot be empty.");
    }
    this.paymentDate = paymentDate;
    this.paymentMode = paymentMode;
  }
}
