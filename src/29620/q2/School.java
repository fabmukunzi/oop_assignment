package q2;

public class School extends Entity {
  private String schoolName;
  private String address;
  private String phoneNumber;
  private String email;

  public String getSchoolName() {
    return schoolName;
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

  public School(
      int id,
      String cDate,
      String uDate,
      String schoolName,
      String address,
      String phoneNumber,
      String email)
      throws SchoolDataException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new SchoolDataException("Phone number must be 10 digits.");
    }
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new SchoolDataException("Invalid email format.");
    }
    this.schoolName = schoolName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}
