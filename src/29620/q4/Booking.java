package q4;

public class Booking extends Customer {
  private String bookingDate;
  private String checkInDate;
  private String checkOutDate;

  public String getBookingDate() {
    return bookingDate;
  }

  public String getCheckInDate() {
    return checkInDate;
  }

  public String getCheckOutDate() {
    return checkOutDate;
  }

  public Booking(
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
      String checkOutDate)
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
        contactNumber);
    if (bookingDate == null
        || bookingDate.isEmpty()
        || checkInDate == null
        || checkInDate.isEmpty()
        || checkOutDate == null
        || checkOutDate.isEmpty()) {
      throw new HotelException("Booking dates cannot be empty.");
    }
    this.bookingDate = bookingDate;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
  }
}
