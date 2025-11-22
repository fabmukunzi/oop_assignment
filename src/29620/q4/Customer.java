package q4;

public class Customer extends Room {
  private String customerName;
  private String customerEmail;
  private String contactNumber;

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public Customer(
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
      String contactNumber)
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
        pricePerNight);
    if (customerEmail == null
        || !customerEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new HotelException("Invalid customer email format.");
    }
    if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
      throw new HotelException("Contact number must be 10 digits.");
    }
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.contactNumber = contactNumber;
  }
}
