package q5;

import java.util.Scanner;
import java.time.LocalDate;

public final class RentalRecord extends Invoice {

  public RentalRecord(
      int id,
      String cDate,
      String uDate,
      String companyName,
      String address,
      String phoneNumber,
      String branchName,
      String locationCode,
      String vehicleType,
      String registrationNumber,
      double dailyRate,
      String customerName,
      String licenseNumber,
      String contactNumber,
      String rentalDate,
      String returnDate,
      int rentalDays,
      double rentalCharge,
      double penaltyCharge,
      String paymentMode,
      String transactionId,
      double totalCharge)
      throws RentalException {
    super(
        id,
        cDate,
        uDate,
        companyName,
        address,
        phoneNumber,
        branchName,
        locationCode,
        vehicleType,
        registrationNumber,
        dailyRate,
        customerName,
        licenseNumber,
        contactNumber,
        rentalDate,
        returnDate,
        rentalDays,
        rentalCharge,
        penaltyCharge,
        paymentMode,
        transactionId,
        totalCharge);
  }

  public double calculateTotalCharge() {
    return getRentalCharge() + getPenaltyCharge();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Vehicle Rental System Data Entry");

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

      System.out.println("\n--- Branch Data ---");
      System.out.print("Branch Name: ");
      String branchName = scanner.nextLine();
      System.out.print("Location Code (>=3 chars): ");
      String locationCode = scanner.nextLine();

      System.out.println("\n--- Vehicle Data ---");
      System.out.print("Vehicle Type: ");
      String vehicleType = scanner.nextLine();
      System.out.print("Registration Number: ");
      String registrationNumber = scanner.nextLine();
      System.out.print("Daily Rate (>0): ");
      double dailyRate = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Customer Data ---");
      System.out.print("Customer Name: ");
      String customerName = scanner.nextLine();
      System.out.print("License Number: ");
      String licenseNumber = scanner.nextLine();
      System.out.print("Contact Number: ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Rental Data ---");
      System.out.print("Rental Date: ");
      String rentalDate = scanner.nextLine();
      System.out.print("Return Date: ");
      String returnDate = scanner.nextLine();
      System.out.print("Rental Days (>0): ");
      int rentalDays = scanner.nextInt();

      System.out.println("\n--- Charge Data ---");
      System.out.print("Rental Charge (>=0): ");
      double rentalCharge = scanner.nextDouble();
      System.out.print("Penalty Charge (>=0): ");
      double penaltyCharge = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Payment Data ---");
      System.out.print("Payment Mode: ");
      String paymentMode = scanner.nextLine();
      System.out.print("Transaction ID: ");
      String transactionId = scanner.nextLine();

      System.out.println("\n--- Invoice Data ---");
      System.out.print("Total Charge (>0): ");
      double totalCharge = scanner.nextDouble();

      RentalRecord record =
          new RentalRecord(
              id,
              createdDateStr,
              updatedDateStr,
              companyName,
              address,
              phoneNumber,
              branchName,
              locationCode,
              vehicleType,
              registrationNumber,
              dailyRate,
              customerName,
              licenseNumber,
              contactNumber,
              rentalDate,
              returnDate,
              rentalDays,
              rentalCharge,
              penaltyCharge,
              paymentMode,
              transactionId,
              totalCharge);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Vehicle Rental Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Company: " + record.getCompanyName() + ", Branch: " + record.getBranchName());
      System.out.println("Vehicle: " + record.getVehicleType() + ", Customer: " + record.getCustomerName());
      System.out.println("Rental: Days=" + record.getRentalDays() + ", Charge=" + record.getRentalCharge());
      System.out.printf(
          "\n**CALCULATED TOTAL CHARGE**: %.2f" + STUDENT_ID, record.calculateTotalCharge());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (RentalException e) {
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
