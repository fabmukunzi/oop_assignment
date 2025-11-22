package q4;

public class Hotel extends Entity {
  private String hotelName;
  private String address;
  private String phoneNumber;
  private String email;

  public String getHotelName() {
    return hotelName;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public Hotel(
      int id,
      String cDate,
      String uDate,
      String hotelName,
      String address,
      String phoneNumber,
      String email)
      throws HotelException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new HotelException("Phone number must be 10 digits.");
    }
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new HotelException("Invalid email format.");
    }
    this.hotelName = hotelName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}
