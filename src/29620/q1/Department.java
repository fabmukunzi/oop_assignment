package q1;

public class Department extends Hospital {
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
      String hName,
      String addr,
      String phone,
      String email,
      String deptName,
      String deptCode)
      throws HospitalDataException {
    super(id, cDate, uDate, hName, addr, phone, email);

    if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+")) {
      throw new HospitalDataException("Department code must be alphanumeric and >= 3 chars.");
    }

    this.departmentName = deptName;
    this.departmentCode = deptCode;
  }

  
}

