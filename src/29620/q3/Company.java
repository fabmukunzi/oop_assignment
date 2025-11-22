package q3;

public class Company extends Entity {
  private String companyName;
  private String address;
  private String phoneNumber;
  private String email;

  public String getCompanyName() {
    return companyName;
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

  public Company(
      int id,
      String cDate,
      String uDate,
      String companyName,
      String address,
      String phoneNumber,
      String email)
      throws PayrollException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new PayrollException("Phone number must be 10 digits.");
    }
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new PayrollException("Invalid email format.");
    }
    this.companyName = companyName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}
