package q3;

public class Allowance extends Attendance {
  private double housingAllowance;
  private double transportAllowance;

  public double getHousingAllowance() {
    return housingAllowance;
  }

  public double getTransportAllowance() {
    return transportAllowance;
  }

  public Allowance(
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
      int leaveDays,
      double housingAllowance,
      double transportAllowance)
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
        contactNumber,
        totalDays,
        presentDays,
        leaveDays);
    if (housingAllowance < 0 || transportAllowance < 0) {
      throw new PayrollException("All allowances must be >= 0.");
    }
    this.housingAllowance = housingAllowance;
    this.transportAllowance = transportAllowance;
  }
}
