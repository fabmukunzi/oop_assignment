package q7;

import java.util.Scanner;
import java.time.LocalDate;

public final class RealEstateRecord extends Commission {

  public RealEstateRecord(
      int id,
      String cDate,
      String uDate,
      String agencyName,
      String location,
      String phoneNumber,
      String agentName,
      String agentEmail,
      String licenseNumber,
      String propertyCode,
      String propertyType,
      double price,
      String sellerName,
      String contactNumber,
      String buyerName,
      String email,
      String agreementDate,
      String terms,
      double paymentAmount,
      String paymentDate,
      double commissionRate,
      double commissionAmount)
      throws RealEstateException {
    super(
        id,
        cDate,
        uDate,
        agencyName,
        location,
        phoneNumber,
        agentName,
        agentEmail,
        licenseNumber,
        propertyCode,
        propertyType,
        price,
        sellerName,
        contactNumber,
        buyerName,
        email,
        agreementDate,
        terms,
        paymentAmount,
        paymentDate,
        commissionRate,
        commissionAmount);
  }

  public double calculateCommission() {
    return (getPrice() * getCommissionRate()) / 100;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Real Estate Management System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Agency Data ---");
      System.out.print("Agency Name: ");
      String agencyName = scanner.nextLine();
      System.out.print("Location: ");
      String location = scanner.nextLine();
      System.out.print("Phone (10 digits): ");
      String phoneNumber = scanner.nextLine();

      System.out.println("\n--- Agent Data ---");
      System.out.print("Agent Name: ");
      String agentName = scanner.nextLine();
      System.out.print("Agent Email: ");
      String agentEmail = scanner.nextLine();
      System.out.print("License Number: ");
      String licenseNumber = scanner.nextLine();

      System.out.println("\n--- Property Data ---");
      System.out.print("Property Code: ");
      String propertyCode = scanner.nextLine();
      System.out.print("Property Type: ");
      String propertyType = scanner.nextLine();
      System.out.print("Price (>0): ");
      double price = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Seller Data ---");
      System.out.print("Seller Name: ");
      String sellerName = scanner.nextLine();
      System.out.print("Contact Number: ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Buyer Data ---");
      System.out.print("Buyer Name: ");
      String buyerName = scanner.nextLine();
      System.out.print("Buyer Email: ");
      String email = scanner.nextLine();

      System.out.println("\n--- Agreement Data ---");
      System.out.print("Agreement Date: ");
      String agreementDate = scanner.nextLine();
      System.out.print("Terms: ");
      String terms = scanner.nextLine();

      System.out.println("\n--- Payment Data ---");
      System.out.print("Payment Amount (>0): ");
      double paymentAmount = scanner.nextDouble();
      scanner.nextLine();
      System.out.print("Payment Date: ");
      String paymentDate = scanner.nextLine();

      System.out.println("\n--- Commission Data ---");
      System.out.print("Commission Rate (>=0): ");
      double commissionRate = scanner.nextDouble();
      System.out.print("Commission Amount: ");
      double commissionAmount = scanner.nextDouble();

      RealEstateRecord record =
          new RealEstateRecord(
              id,
              createdDateStr,
              updatedDateStr,
              agencyName,
              location,
              phoneNumber,
              agentName,
              agentEmail,
              licenseNumber,
              propertyCode,
              propertyType,
              price,
              sellerName,
              contactNumber,
              buyerName,
              email,
              agreementDate,
              terms,
              paymentAmount,
              paymentDate,
              commissionRate,
              commissionAmount);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Real Estate Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Agency: " + record.getAgencyName() + ", Agent: " + record.getAgentName());
      System.out.println("Property: " + record.getPropertyCode() + ", Price: " + record.getPrice());
      System.out.println("Buyer: " + record.getBuyerName() + ", Seller: " + record.getSellerName());
      System.out.printf(
          "\n**CALCULATED COMMISSION**: %.2f" + STUDENT_ID, record.calculateCommission());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (RealEstateException e) {
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
