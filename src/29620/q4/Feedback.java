package q4;

public class Feedback extends Bill {
  private int rating;
  private String comments;

  public int getRating() {
    return rating;
  }

  public String getComments() {
    return comments;
  }

  public Feedback(
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
      String paymentDate,
      double roomCharge,
      double serviceCharge,
      int rating,
      String comments)
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
        serviceCost,
        paymentMethod,
        paymentDate,
        roomCharge,
        serviceCharge);
    if (rating < 1 || rating > 5) {
      throw new HotelException("Rating must be between 1-5.");
    }
    this.rating = rating;
    this.comments = comments;
  }
}
