package q5;

public class Company extends Entity {
  private String companyName;
  private String address;
  private String phoneNumber;

  public String getCompanyName() {
    return companyName;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Company(
      int id, String cDate, String uDate, String companyName, String address, String phoneNumber)
      throws RentalException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new RentalException("Phone number must be 10 digits.");
    }
    this.companyName = companyName;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }
}
