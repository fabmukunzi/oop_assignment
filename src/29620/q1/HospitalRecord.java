package q1;

import java.util.Scanner;
import java.time.LocalDate;

public final class HospitalRecord extends Bill {

  public HospitalRecord(
      int id,
      String cDate,
      String uDate,
      String hName,
      String addr,
      String hPhone,
      String hEmail,
      String dName,
      String dCode,
      String docName,
      String spec,
      String docEmail,
      String docPhone,
      String nName,
      String nShift,
      int years,
      String pName,
      int pAge,
      String pGender,
      String pContact,
      String aDate,
      String rNumber,
      double rCharges,
      String diag,
      String treat,
      double treatCost,
      double dFee,
      double mCost)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone, nName, nShift, years, pName, pAge, pGender, pContact, aDate, rNumber, rCharges,
        diag, treat, treatCost, dFee, mCost);
  }

  public double generateBill() {
    return getTotalBill();
  }

  public static void main(String[] args) {
    final String STUDENT_ID = "29620";

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Hospital Management System Data Entry");

      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- Hospital Data ---");
      System.out.print("Hospital Name: ");
      String hName = scanner.nextLine();
      System.out.print("Address: ");
      String addr = scanner.nextLine();
      System.out.print("Phone (10 digits): ");
      String hPhone = scanner.nextLine();
      System.out.print("Email (valid format): ");
      String hEmail = scanner.nextLine();

      System.out.println("\n--- Department Data ---");
      System.out.print("Department Name: ");
      String dName = scanner.nextLine();
      System.out.print("Department Code (alphanumeric, >=3 chars): ");
      String dCode = scanner.nextLine();

      System.out.println("\n--- Patient Data ---");
      System.out.print("Patient Name: ");
      String pName = scanner.nextLine();
      System.out.print("Age (>0): ");
      int pAge = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Gender (Male/Female/Other): ");
      String pGender = scanner.nextLine();
      System.out.print("Contact Number: ");
      String pContact = scanner.nextLine();

      System.out.println("\n--- Admission Data ---");
      String aDate = LocalDate.now().toString();
      System.out.print("Room Number: ");
      String rNumber = scanner.nextLine();
      System.out.print("Room Charges (>0): ");
      double rCharges = scanner.nextDouble();
      scanner.nextLine();

      System.out.println("\n--- Treatment Data ---");
      System.out.print("Diagnosis: ");
      String diag = scanner.nextLine();
      System.out.print("Treatment Given: ");
      String treat = scanner.nextLine();
      System.out.print("Treatment Cost (>0): ");
      double treatCost = scanner.nextDouble();
      scanner.nextLine();

      double dFee = 500.0;
      double mCost = 150.0;

      String docName = "Dr. Smith";
      String spec = "Cardiology";
      String docEmail = "drs@hospital.com";
      String docPhone = "9876543210";

      String nName = "Nurse Jane";
      String nShift = "Day";
      int years = 5;

      HospitalRecord record =
          new HospitalRecord(
              id,
              createdDateStr,
              updatedDateStr,
              hName,
              addr,
              hPhone,
              hEmail,
              dName,
              dCode,
              docName,
              spec,
              docEmail,
              docPhone,
              nName,
              nShift,
              years,
              pName,
              pAge,
              pGender,
              pContact,
              aDate,
              rNumber,
              rCharges,
              diag,
              treat,
              treatCost,
              dFee,
              mCost);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed Hospital Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);

      System.out.println("Hospital: " + record.getHospitalName() + ", " + record.getAddress());
      System.out.println("Patient: " + record.getPatientName() + ", Age: " + record.getAge());
      System.out.println(
          "Treatment: " + record.getDiagnosis() + ", Cost: " + record.getTreatmentCost());

      double finalBill = record.generateBill();
      System.out.println("\n--- Final Charges Summary ---" + STUDENT_ID);
      System.out.println("Calculated Doctor Fee: " + record.getDoctorFee() + STUDENT_ID);
      System.out.println("Calculated Medicine Cost: " + record.getMedicineCost() + STUDENT_ID);
      System.out.println("Calculated Room Charges: " + record.getRoomCharges() + STUDENT_ID);
      System.out.println("Calculated Treatment Cost: " + record.getTreatmentCost() + STUDENT_ID);
      System.out.println("--------------------------------------------" + STUDENT_ID);
      System.out.printf("**FINAL COMPUTED BILL**: %.2f" + STUDENT_ID, finalBill);
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (HospitalDataException e) {
      System.err.println("\n**VALIDATION FAILED** " + STUDENT_ID);
      System.err.println("Error: " + e.getMessage() + STUDENT_ID);
    } catch (Exception e) {
      System.err.println("\n**UNEXPECTED ERROR** " + STUDENT_ID);
      System.err.println("An unexpected error occurred: " + e.getMessage() + STUDENT_ID);
    }
  }
}

