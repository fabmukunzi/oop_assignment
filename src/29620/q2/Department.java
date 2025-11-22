package q2;

public class Department extends School {
  private String departmentName;
  private String departmentCode;

  public String getDepartmentName() {
    return departmentName;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public Department(
      int id,
      String cDate,
      String uDate,
      String schoolName,
      String address,
      String phoneNumber,
      String email,
      String departmentName,
      String departmentCode)
      throws SchoolDataException {
    super(id, cDate, uDate, schoolName, address, phoneNumber, email);
    if (departmentCode == null
        || departmentCode.length() < 3
        || !departmentCode.matches("^[a-zA-Z0-9]+$")) {
      throw new SchoolDataException(
          "Department code must be alphanumeric and at least 3 characters.");
    }
    this.departmentName = departmentName;
    this.departmentCode = departmentCode;
  }
}
