package q9;

import java.util.Scanner;
import java.time.LocalDate;

public final class TicketRecord extends Invoice {

  public TicketRecord(
      int id,
      String cDate,
      String uDate,
      String airlineName,
      String address,
      String contactEmail,
      String flightNumber,
      String destination,
      String departureTime,
      String passengerName,
      String passportNumber,
      String nationality,
      String seatNumber,
      String seatType,
      String ticketNumber,
      double price,
      double baggageWeight,
      double baggageFee,
      String paymentDate,
      String paymentMode,
      double totalFare)
      throws AirlineException {
    super(
        id,
        cDate,
        uDate,
        airlineName,
        address,
        contactEmail,
        flightNumber,
        destination,
        departureTime,
        passengerName,
        passportNumber,
        nationality,
        seatNumber,
        seatType,
        ticketNumber,
        price,
        baggageWeight,
        baggageFee,
        paymentDate,
        paymentMode,
        totalFare);
  }

  public double generateInvoice() {
    return getPrice() + getBaggageFee();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("Airline Ticketing System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Airline Data ---");
      System.out.print("Airline Name: ");
      String airlineName = scanner.nextLine();
      System.out.print("Address: ");
      String address = scanner.nextLine();
      System.out.print("Contact Email: ");
      String contactEmail = scanner.nextLine();

      System.out.println("\n--- Flight Data ---");
      System.out.print("Flight Number: ");
      String flightNumber = scanner.nextLine();
      System.out.print("Destination: ");
      String destination = scanner.nextLine();
      System.out.print("Departure Time: ");
      String departureTime = scanner.nextLine();

      System.out.println("\n--- Passenger Data ---");
      System.out.print("Passenger Name: ");
      String passengerName = scanner.nextLine();
      System.out.print("Passport Number: ");
      String passportNumber = scanner.nextLine();
      System.out.print("Nationality: ");
      String nationality = scanner.nextLine();

      System.out.println("\n--- Seat Data ---");
      System.out.print("Seat Number: ");
      String seatNumber = scanner.nextLine();
      System.out.print("Seat Type (Economy/Business): ");
      String seatType = scanner.nextLine();

      System.out.println("\n--- Ticket Data ---");
      System.out.print("Ticket Number: ");
      String ticketNumber = scanner.nextLine();
      System.out.print("Price (>0): ");
      double price = scanner.nextDouble();

      System.out.println("\n--- Baggage Data ---");
      System.out.print("Baggage Weight (>=0): ");
      double baggageWeight = scanner.nextDouble();
      System.out.print("Baggage Fee (>=0): ");
      double baggageFee = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Payment Data ---");
      System.out.print("Payment Date: ");
      String paymentDate = scanner.nextLine();
      System.out.print("Payment Mode: ");
      String paymentMode = scanner.nextLine();

      System.out.println("\n--- Invoice Data ---");
      System.out.print("Total Fare (>0): ");
      double totalFare = scanner.nextDouble();

      TicketRecord record =
          new TicketRecord(
              id,
              createdDateStr,
              updatedDateStr,
              airlineName,
              address,
              contactEmail,
              flightNumber,
              destination,
              departureTime,
              passengerName,
              passportNumber,
              nationality,
              seatNumber,
              seatType,
              ticketNumber,
              price,
              baggageWeight,
              baggageFee,
              paymentDate,
              paymentMode,
              totalFare);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Airline Ticket Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("Airline: " + record.getAirlineName() + ", Flight: " + record.getFlightNumber());
      System.out.println("Passenger: " + record.getPassengerName() + ", Seat: " + record.getSeatNumber());
      System.out.println("Ticket: " + record.getTicketNumber() + ", Price: " + record.getPrice());
      System.out.printf("\n**GENERATED INVOICE**: %.2f" + STUDENT_ID, record.generateInvoice());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (AirlineException e) {
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
