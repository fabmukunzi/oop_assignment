package q4;

public class Service extends Booking {
  private String serviceName;
  private double serviceCost;

  public String getServiceName() {
    return serviceName;
  }

  public double getServiceCost() {
    return serviceCost;
  }

  public Service(
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
      double serviceCost)
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
        checkOutDate);
    if (serviceCost <= 0) {
      throw new HotelException("Service cost must be > 0.");
    }
    this.serviceName = serviceName;
    this.serviceCost = serviceCost;
  }
}
