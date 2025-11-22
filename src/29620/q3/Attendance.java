package q3;

public class Attendance extends Employee {
  private int totalDays;
  private int presentDays;
  private int leaveDays;

  public int getTotalDays() {
    return totalDays;
  }

  public int getPresentDays() {
    return presentDays;
  }

  public int getLeaveDays() {
    return leaveDays;
  }

  public Attendance(
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
      String contactNumber,
      int totalDays,
      int presentDays,
      int leaveDays)
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
        phone,
        employeeName,
        employeeId,
        designation,
        contactNumber);
    if (totalDays < 0 || presentDays < 0 || leaveDays < 0) {
      throw new PayrollException("All attendance values must be >= 0.");
    }
    if (presentDays > totalDays) {
      throw new PayrollException("Present days cannot exceed total days.");
    }
    this.totalDays = totalDays;
    this.presentDays = presentDays;
    this.leaveDays = leaveDays;
  }
}
