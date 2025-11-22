package q3;

public class Manager extends Department {
  private String managerName;
  private String managerEmail;
  private String phone;

  public String getManagerName() {
    return managerName;
  }

  public String getManagerEmail() {
    return managerEmail;
  }

  public String getPhone() {
    return phone;
  }

  public Manager(
      int id,
      String cDate,
      String uDate,
      String companyName,
      String address,
      String phoneNumber,
      String email,
      String departmentName,
      String departmentCode,
      String managerName,
      String managerEmail,
      String phone)
      throws PayrollException {
    super(
        id, cDate, uDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
    if (managerName == null || managerName.isEmpty()) {
      throw new PayrollException("Manager name cannot be empty.");
    }
    if (managerEmail == null
        || !managerEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new PayrollException("Invalid manager email format.");
    }
    if (phone == null || !phone.matches("\\d{10}")) {
      throw new PayrollException("Manager phone must be 10 digits.");
    }
    this.managerName = managerName;
    this.managerEmail = managerEmail;
    this.phone = phone;
  }
}
