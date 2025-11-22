package q10;

import java.time.LocalDate;
import java.util.Scanner;

public final class OrderRecord extends Invoice {

  public OrderRecord(
      int id,
      String cDate,
      String uDate,
      String storeName,
      String storeAddress,
      String email,
      String categoryName,
      String categoryCode,
      String productName,
      String productCode,
      double price,
      String customerName,
      String contactNumber,
      String address,
      String orderDate,
      String orderId,
      String paymentMethod,
      String paymentStatus,
      String shippingAddress,
      double shippingCost,
      double totalAmount)
      throws ShoppingException {
    super(
        id,
        cDate,
        uDate,
        storeName,
        storeAddress,
        email,
        categoryName,
        categoryCode,
        productName,
        productCode,
        price,
        customerName,
        contactNumber,
        address,
        orderDate,
        orderId,
        paymentMethod,
        paymentStatus,
        shippingAddress,
        shippingCost,
        totalAmount);
  }

  public double calculateTotalAmount() {
    return getPrice() + getShippingCost();
  }

  public static void main(String[] args) {
      final String STUDENT_ID = "29620";

      try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Online Shopping System Data Entry");
          System.out.println("\n--- Entity Data ---");
          System.out.print("Enter Entity ID (>0): ");
          int id = scanner.nextInt();
          scanner.nextLine();
          String createdDateStr = LocalDate.now().toString();
          String updatedDateStr = createdDateStr;

          System.out.println("\n--- Store Data ---");
          System.out.print("Store Name: ");
          String storeName = scanner.nextLine();
          System.out.print("Store Address: ");
          String storeAddress = scanner.nextLine();
          System.out.print("Email: ");
          String email = scanner.nextLine();

          System.out.println("\n--- Category Data ---");
          System.out.print("Category Name: ");
          String categoryName = scanner.nextLine();
          System.out.print("Category Code (>=3 chars): ");
          String categoryCode = scanner.nextLine();

          System.out.println("\n--- Product Data ---");
          System.out.print("Product Name: ");
          String productName = scanner.nextLine();
          System.out.print("Product Code: ");
          String productCode = scanner.nextLine();
          System.out.print("Price (>0): ");
          double price = scanner.nextDouble();
          scanner.nextLine();

          System.out.println("\n--- Customer Data ---");
          System.out.print("Customer Name: ");
          String customerName = scanner.nextLine();
          System.out.print("Contact Number: ");
          String contactNumber = scanner.nextLine();
          System.out.print("Customer Address: ");
          String address = scanner.nextLine();

          String orderDate = LocalDate.now().toString();
          String orderId = "ORD" + System.currentTimeMillis();

          System.out.println("\n--- Payment Data ---");
          System.out.print("Payment Method: ");
          String paymentMethod = scanner.nextLine();
          String paymentStatus = "Completed";

          System.out.println("\n--- Shipping Data ---");
          System.out.print("Shipping Cost (>=0): ");
          double shippingCost = scanner.nextDouble();
          String shippingAddress = address; // Use customer address

          System.out.println("\n--- Invoice Data ---");
          System.out.print("Total Amount (>0): ");
          double totalAmount = scanner.nextDouble();

          OrderRecord record =
                  new OrderRecord(
                          id,
                          createdDateStr,
                          updatedDateStr,
                          storeName,
                          storeAddress,
                          email,
                          categoryName,
                          categoryCode,
                          productName,
                          productCode,
                          price,
                          customerName,
                          contactNumber,
                          address,
                          orderDate,
                          orderId,
                          paymentMethod,
                          paymentStatus,
                          shippingAddress,
                          shippingCost,
                          totalAmount);

          System.out.println("\n==============================================" + STUDENT_ID);
          System.out.println("Computed Online Shopping Record Details" + STUDENT_ID);
          System.out.println("==============================================" + STUDENT_ID);
          System.out.println("Store: " + record.getStoreName() + ", " + record.getAddress());
          System.out.println("Product: " + record.getProductName() + ", Price: " + record.getPrice());
          System.out.println("Customer: " + record.getCustomerName() + ", Order: " + record.getOrderId());
          System.out.printf(
                  "\n**CALCULATED TOTAL AMOUNT**: %.2f" + STUDENT_ID, record.calculateTotalAmount());
          System.out.println("\n==============================================" + STUDENT_ID);

      } catch (ShoppingException e) {
          System.err.println("\n**VALIDATION FAILED** " + STUDENT_ID);
          System.err.println("Error: " + e.getMessage() + STUDENT_ID);
      } catch (Exception e) {
          System.err.println("\n**UNEXPECTED ERROR** " + STUDENT_ID);
          System.err.println("An unexpected error occurred: " + e.getMessage() + STUDENT_ID);
      }
  }
}
