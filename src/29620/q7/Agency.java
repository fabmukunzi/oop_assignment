package q7;

public class Agency extends Entity {
  private String agencyName;
  private String location;
  private String phoneNumber;

  public String getAgencyName() {
    return agencyName;
  }

  public String getLocation() {
    return location;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Agency(
      int id, String cDate, String uDate, String agencyName, String location, String phoneNumber)
      throws RealEstateException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new RealEstateException("Phone number must be 10 digits.");
    }
    this.agencyName = agencyName;
    this.location = location;
    this.phoneNumber = phoneNumber;
  }
}
