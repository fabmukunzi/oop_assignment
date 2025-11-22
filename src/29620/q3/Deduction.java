package q3;

public class Deduction extends Allowance {
  private double taxDeduction;
  private double loanDeduction;

  public double getTaxDeduction() {
    return taxDeduction;
  }

  public double getLoanDeduction() {
    return loanDeduction;
  }

  public Deduction(
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
      double loanDeduction)
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
        transportAllowance);
    if (taxDeduction < 0 || loanDeduction < 0) {
      throw new PayrollException("All deductions must be >= 0.");
    }
    this.taxDeduction = taxDeduction;
    this.loanDeduction = loanDeduction;
  }
}
