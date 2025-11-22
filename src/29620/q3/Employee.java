package q3;

public class Employee extends Manager {
  private String employeeName;
  private int employeeId;
  private String designation;
  private String contactNumber;

  public String getEmployeeName() {
    return employeeName;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getDesignation() {
    return designation;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public Employee(
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
      String phone,
      String employeeName,
      int employeeId,
      String designation,
      String contactNumber)
      throws PayrollException {
    super(
        id,
        cDate,
        uDate,
        companyName,
        address,
        phoneNumber,
        email,
        departmentName,
        departmentCode,
        managerName,
        managerEmail,
        phone);
    if (employeeId <= 0) {
      throw new PayrollException("Employee ID must be greater than 0.");
    }
    if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
      throw new PayrollException("Contact number must be 10 digits.");
    }
    this.employeeName = employeeName;
    this.employeeId = employeeId;
    this.designation = designation;
    this.contactNumber = contactNumber;
  }
}
