package q4;

public class Bill extends Payment {
  private double roomCharge;
  private double serviceCharge;
  private double totalBill;

  public double getRoomCharge() {
    return roomCharge;
  }

  public double getServiceCharge() {
    return serviceCharge;
  }

  public double getTotalBill() {
    return totalBill;
  }

  public Bill(
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
      double serviceCharge)
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
        paymentDate);
    if (roomCharge <= 0 || serviceCharge <= 0) {
      throw new HotelException("Room and service charges must be > 0.");
    }
    this.roomCharge = roomCharge;
    this.serviceCharge = serviceCharge;
    this.totalBill = roomCharge + serviceCharge;
    if (totalBill <= 0) {
      throw new HotelException("Total bill must be > 0.");
    }
  }
}
