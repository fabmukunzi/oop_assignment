package q3;

public class Salary extends Deduction {
  private double basicSalary;
  private double grossSalary;
  private double netSalary;

  public double getBasicSalary() {
    return basicSalary;
  }

  public double getGrossSalary() {
    return grossSalary;
  }

  public double getNetSalary() {
    return netSalary;
  }

  public Salary(
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
      double transportAllowance,
      double taxDeduction,
      double loanDeduction,
      double basicSalary)
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
        leaveDays,
        housingAllowance,
        transportAllowance,
        taxDeduction,
        loanDeduction);
    if (basicSalary <= 0) {
      throw new PayrollException("Basic salary must be > 0.");
    }
    this.basicSalary = basicSalary;
    this.grossSalary = basicSalary + housingAllowance + transportAllowance;
    this.netSalary = grossSalary - taxDeduction - loanDeduction;
    if (grossSalary <= 0 || netSalary <= 0) {
      throw new PayrollException("Gross and net salary must be > 0.");
    }
  }
}
