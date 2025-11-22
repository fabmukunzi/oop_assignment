package q4;

public class Payment extends Service {
  private String paymentMethod;
  private String paymentDate;

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public Payment(
      int id,
      String cDate,
      String uDate,
      String hotelName,
      String address,
      String phoneNumber,
      String email,
      String roomNumber,
      String roomType,
      double pricePerNight,
      String customerName,
      String customerEmail,
      String contactNumber,
      String bookingDate,
      String checkInDate,
      String checkOutDate,
      String serviceName,
      double serviceCost,
      String paymentMethod,
      String paymentDate)
      throws HotelException {
    super(
        id,
        cDate,
        uDate,
        hotelName,
        address,
        phoneNumber,
        email,
        roomNumber,
        roomType,
        pricePerNight,
        customerName,
        customerEmail,
        contactNumber,
        bookingDate,
        checkInDate,
        checkOutDate,
        serviceName,
        serviceCost);
    if (paymentMethod == null || paymentDate == null) {
      throw new HotelException("Payment method and date cannot be null.");
    }
    this.paymentMethod = paymentMethod;
    this.paymentDate = paymentDate;
  }
}
