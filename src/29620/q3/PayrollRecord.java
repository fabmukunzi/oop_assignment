package q3;

import java.util.Scanner;
import java.time.LocalDate;

public final class PayrollRecord extends Salary {

  public PayrollRecord(
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
        loanDeduction,
        basicSalary);
  }

  public double calculateNetSalary() {
    return getBasicSalary()
        + getHousingAllowance()
        + getTransportAllowance()
        - getTaxDeduction()
        - getLoanDeduction();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Employee Payroll System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Company Data ---");
      System.out.print("Company Name: ");
      String companyName = scanner.nextLine();
      System.out.print("Address: ");
      String address = scanner.nextLine();
      System.out.print("Phone (10 digits): ");
      String phoneNumber = scanner.nextLine();
      System.out.print("Email: ");
      String email = scanner.nextLine();

      System.out.println("\n--- Department Data ---");
      System.out.print("Department Name: ");
      String departmentName = scanner.nextLine();
      System.out.print("Department Code (>=3 chars): ");
      String departmentCode = scanner.nextLine();

      System.out.println("\n--- Manager Data ---");
      System.out.print("Manager Name: ");
      String managerName = scanner.nextLine();
      System.out.print("Manager Email: ");
      String managerEmail = scanner.nextLine();
      System.out.print("Manager Phone: ");
      String phone = scanner.nextLine();

      System.out.println("\n--- Employee Data ---");
      System.out.print("Employee Name: ");
      String employeeName = scanner.nextLine();
      System.out.print("Employee ID (>0): ");
      int employeeId = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Designation: ");
      String designation = scanner.nextLine();
      System.out.print("Contact Number (10 digits): ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Attendance Data ---");
      System.out.print("Total Days (>=0): ");
      int totalDays = scanner.nextInt();
      System.out.print("Present Days (>=0): ");
      int presentDays = scanner.nextInt();
      System.out.print("Leave Days (>=0): ");
      int leaveDays = scanner.nextInt();

      System.out.println("\n--- Allowance Data ---");
      System.out.print("Housing Allowance (>=0): ");
      double housingAllowance = scanner.nextDouble();
      System.out.print("Transport Allowance (>=0): ");
      double transportAllowance = scanner.nextDouble();

      System.out.println("\n--- Deduction Data ---");
      System.out.print("Tax Deduction (>=0): ");
      double taxDeduction = scanner.nextDouble();
      System.out.print("Loan Deduction (>=0): ");
      double loanDeduction = scanner.nextDouble();

      System.out.println("\n--- Salary Data ---");
      System.out.print("Basic Salary (>0): ");
      double basicSalary = scanner.nextDouble();

      PayrollRecord record =
          new PayrollRecord(
              id,
              createdDateStr,
              updatedDateStr,
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
              loanDeduction,
              basicSalary);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Payroll Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Company: " + record.getCompanyName() + ", " + record.getAddress());
      System.out.println("Employee: " + record.getEmployeeName() + ", ID: " + record.getEmployeeId());
      System.out.println("Salary: Basic=" + record.getBasicSalary() + ", Net=" + record.getNetSalary());
      System.out.printf(
          "\n**CALCULATED NET SALARY**: %.2f" + STUDENT_ID, record.calculateNetSalary());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (PayrollException e) {
      System.err.println("\n**VALIDATION FAILED** " + STUDENT_ID);
      System.err.println("Error: " + e.getMessage() + STUDENT_ID);
    } catch (Exception e) {
      System.err.println("\n**UNEXPECTED ERROR** " + STUDENT_ID);
      System.err.println("An unexpected error occurred: " + e.getMessage() + STUDENT_ID);
    } finally {
      scanner.close();
    }
  }
}
