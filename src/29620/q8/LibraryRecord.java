package q8;

import java.util.Scanner;
import java.time.LocalDate;

public final class LibraryRecord extends Record {

  public LibraryRecord(
      int id,
      String cDate,
      String uDate,
      String libraryName,
      String location,
      String phoneNumber,
      String sectionName,
      String sectionCode,
      String title,
      String author,
      String ISBN,
      String memberName,
      int memberId,
      String contactNumber,
      String borrowDate,
      String returnDate,
      double fineAmount,
      int daysLate,
      String paymentDate,
      String paymentMode,
      double totalFine)
      throws LibraryException {
    super(
        id,
        cDate,
        uDate,
        libraryName,
        location,
        phoneNumber,
        sectionName,
        sectionCode,
        title,
        author,
        ISBN,
        memberName,
        memberId,
        contactNumber,
        borrowDate,
        returnDate,
        fineAmount,
        daysLate,
        paymentDate,
        paymentMode,
        totalFine);
  }

  public double calculateFine() {
    return getFineAmount() * getDaysLate();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Library Management System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Library Data ---");
      System.out.print("Library Name: ");
      String libraryName = scanner.nextLine();
      System.out.print("Location: ");
      String location = scanner.nextLine();
      System.out.print("Phone (10 digits): ");
      String phoneNumber = scanner.nextLine();

      System.out.println("\n--- Section Data ---");
      System.out.print("Section Name: ");
      String sectionName = scanner.nextLine();
      System.out.print("Section Code (>=3 chars): ");
      String sectionCode = scanner.nextLine();

      System.out.println("\n--- Book Data ---");
      System.out.print("Title: ");
      String title = scanner.nextLine();
      System.out.print("Author: ");
      String author = scanner.nextLine();
      System.out.print("ISBN (>=10 chars): ");
      String ISBN = scanner.nextLine();

      System.out.println("\n--- Member Data ---");
      System.out.print("Member Name: ");
      String memberName = scanner.nextLine();
      System.out.print("Member ID (>0): ");
      int memberId = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Contact Number: ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Borrow Data ---");
      System.out.print("Borrow Date: ");
      String borrowDate = scanner.nextLine();
      System.out.print("Return Date: ");
      String returnDate = scanner.nextLine();

      System.out.println("\n--- Fine Data ---");
      System.out.print("Fine Amount (>=0): ");
      double fineAmount = scanner.nextDouble();
      System.out.print("Days Late: ");
      int daysLate = scanner.nextInt();
      scanner.nextLine();

      System.out.println("\n--- Payment Data ---");
      System.out.print("Payment Date: ");
      String paymentDate = scanner.nextLine();
      System.out.print("Payment Mode: ");
      String paymentMode = scanner.nextLine();

      System.out.println("\n--- Record Data ---");
      System.out.print("Total Fine (>0): ");
      double totalFine = scanner.nextDouble();

      LibraryRecord record =
          new LibraryRecord(
              id,
              createdDateStr,
              updatedDateStr,
              libraryName,
              location,
              phoneNumber,
              sectionName,
              sectionCode,
              title,
              author,
              ISBN,
              memberName,
              memberId,
              contactNumber,
              borrowDate,
              returnDate,
              fineAmount,
              daysLate,
              paymentDate,
              paymentMode,
              totalFine);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Library Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Library: " + record.getLibraryName() + ", Section: " + record.getSectionName());
      System.out.println("Book: " + record.getTitle() + ", Member: " + record.getMemberName());
      System.out.println("Fine: Amount=" + record.getFineAmount() + ", Days=" + record.getDaysLate());
      System.out.printf("\n**CALCULATED FINE**: %.2f" + STUDENT_ID, record.calculateFine());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (LibraryException e) {
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
