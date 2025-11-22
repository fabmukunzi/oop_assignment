package q1;

public class Hospital extends Entity {
  private String hospitalName;
  private String address;
  private String phoneNumber;
  private String email;

  public String getHospitalName() {
    return hospitalName;
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

  public Hospital(
      int id, String cDate, String uDate, String hName, String addr, String phone, String email)
      throws HospitalDataException {
    super(id, cDate, uDate);

    if (phone == null || !phone.matches("\\d{10}")) {
      throw new HospitalDataException("Hospital phone number must be 10 digits.");
    }
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new HospitalDataException("Invalid email format for Hospital.");
    }

    this.hospitalName = hName;
    this.address = addr;
    this.phoneNumber = phone;
    this.email = email;
  }
}

