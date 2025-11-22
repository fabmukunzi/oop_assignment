package q9;

public class Airline extends Entity {
  private String airlineName;
  private String address;
  private String contactEmail;

  public String getAirlineName() {
    return airlineName;
  }

  public String getAddress() {
    return address;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public Airline(
      int id, String cDate, String uDate, String airlineName, String address, String contactEmail)
      throws AirlineException {
    super(id, cDate, uDate);
    if (contactEmail == null
        || !contactEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new AirlineException("Invalid email format.");
    }
    this.airlineName = airlineName;
    this.address = address;
    this.contactEmail = contactEmail;
  }
}
