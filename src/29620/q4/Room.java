package q4;

public class Room extends Hotel {
  private String roomNumber;
  private String roomType;
  private double pricePerNight;

  public String getRoomNumber() {
    return roomNumber;
  }

  public String getRoomType() {
    return roomType;
  }

  public double getPricePerNight() {
    return pricePerNight;
  }

  public Room(
      int id,
      String cDate,
      String uDate,
      String hotelName,
      String address,
      String phoneNumber,
      String email,
      String roomNumber,
      String roomType,
      double pricePerNight)
      throws HotelException {
    super(id, cDate, uDate, hotelName, address, phoneNumber, email);
    if (pricePerNight <= 0) {
      throw new HotelException("Price per night must be > 0.");
    }
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.pricePerNight = pricePerNight;
  }
}
