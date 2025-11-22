package q4;

import java.util.Scanner;
import java.time.LocalDate;

public final class ReservationRecord extends Feedback {

  public ReservationRecord(
      int id,
      String cDate,
      String uDate,
      String hotelName,
      String address,
      String phoneNumber,
      String email,
      String roomNumber,
      String roomType,
      double pricePerNight,
      String customerName,
      String customerEmail,
      String contactNumber,
      String bookingDate,
      String checkInDate,
      String checkOutDate,
      String serviceName,
      double serviceCost,
      String paymentMethod,
      String paymentDate,
      double roomCharge,
      double serviceCharge,
      int rating,
      String comments)
      throws HotelException {
    super(
        id,
        cDate,
        uDate,
        hotelName,
        address,
        phoneNumber,
        email,
        roomNumber,
        roomType,
        pricePerNight,
        customerName,
        customerEmail,
        contactNumber,
        bookingDate,
        checkInDate,
        checkOutDate,
        serviceName,
        serviceCost,
        paymentMethod,
        paymentDate,
        roomCharge,
        serviceCharge,
        rating,
        comments);
  }

  public double generateBill() {
    return getRoomCharge() + getServiceCharge();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Hotel Reservation System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Hotel Data ---");
      System.out.print("Hotel Name: ");
      String hotelName = scanner.nextLine();
      System.out.print("Address: ");
      String address = scanner.nextLine();
      System.out.print("Phone (10 digits): ");
      String phoneNumber = scanner.nextLine();
      System.out.print("Email: ");
      String email = scanner.nextLine();

      System.out.println("\n--- Room Data ---");
      System.out.print("Room Number: ");
      String roomNumber = scanner.nextLine();
      System.out.print("Room Type: ");
      String roomType = scanner.nextLine();
      System.out.print("Price Per Night (>0): ");
      double pricePerNight = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Customer Data ---");
      System.out.print("Customer Name: ");
      String customerName = scanner.nextLine();
      System.out.print("Customer Email: ");
      String customerEmail = scanner.nextLine();
      System.out.print("Contact Number (10 digits): ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Booking Data ---");
      System.out.print("Booking Date: ");
      String bookingDate = scanner.nextLine();
      System.out.print("Check-in Date: ");
      String checkInDate = scanner.nextLine();
      System.out.print("Check-out Date: ");
      String checkOutDate = scanner.nextLine();

      System.out.println("\n--- Service Data ---");
      System.out.print("Service Name: ");
      String serviceName = scanner.nextLine();
      System.out.print("Service Cost (>0): ");
      double serviceCost = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Payment Data ---");
      System.out.print("Payment Method: ");
      String paymentMethod = scanner.nextLine();
      System.out.print("Payment Date: ");
      String paymentDate = scanner.nextLine();

      System.out.println("\n--- Bill Data ---");
      System.out.print("Room Charge (>0): ");
      double roomCharge = scanner.nextDouble();
      System.out.print("Service Charge (>0): ");
      double serviceCharge = scanner.nextDouble();

      System.out.println("\n--- Feedback Data ---");
      System.out.print("Rating (1-5): ");
      int rating = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Comments: ");
      String comments = scanner.nextLine();

      ReservationRecord record =
          new ReservationRecord(
              id,
              createdDateStr,
              updatedDateStr,
              hotelName,
              address,
              phoneNumber,
              email,
              roomNumber,
              roomType,
              pricePerNight,
              customerName,
              customerEmail,
              contactNumber,
              bookingDate,
              checkInDate,
              checkOutDate,
              serviceName,
              serviceCost,
              paymentMethod,
              paymentDate,
              roomCharge,
              serviceCharge,
              rating,
              comments);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Hotel Reservation Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Hotel: " + record.getHotelName() + ", " + record.getAddress());
      System.out.println("Customer: " + record.getCustomerName() + ", Room: " + record.getRoomNumber());
      System.out.println("Bill: Room=" + record.getRoomCharge() + ", Service=" + record.getServiceCharge());
      System.out.printf("\n**GENERATED BILL**: %.2f" + STUDENT_ID, record.generateBill());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (HotelException e) {
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
