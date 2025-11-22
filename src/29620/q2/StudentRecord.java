package q2;

import java.util.Scanner;
import java.time.LocalDate;

public final class StudentRecord extends Fee {
  private double averageMarks;

  public double getAverageMarks() {
    return averageMarks;
  }

  public StudentRecord(
      int id,
      String cDate,
      String uDate,
      String schoolName,
      String address,
      String phoneNumber,
      String email,
      String departmentName,
      String departmentCode,
      String teacherName,
      String subject,
      String teacherEmail,
      String phone,
      String studentName,
      int rollNumber,
      String grade,
      String contactNumber,
      String courseName,
      String courseCode,
      int creditHours,
      String examName,
      int maxMarks,
      String examDate,
      int obtainedMarks,
      String remarks,
      double tuitionFee,
      double examFee)
      throws SchoolDataException {
    super(
        id,
        cDate,
        uDate,
        schoolName,
        address,
        phoneNumber,
        email,
        departmentName,
        departmentCode,
        teacherName,
        subject,
        teacherEmail,
        phone,
        studentName,
        rollNumber,
        grade,
        contactNumber,
        courseName,
        courseCode,
        creditHours,
        examName,
        maxMarks,
        examDate,
        obtainedMarks,
        remarks,
        tuitionFee,
        examFee);
    this.averageMarks = calculateAverageMarks();
  }

  public double calculateAverageMarks() {
    return (double) getObtainedMarks() / getMaxMarks() * 100;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String STUDENT_ID = "29620";

    System.out.println("School Management System Data Entry");

    try {
      System.out.println("\n--- Entity Data ---");
      System.out.print("Enter Entity ID (>0): ");
      int id = scanner.nextInt();
      scanner.nextLine();
      String createdDateStr = LocalDate.now().toString();
      String updatedDateStr = createdDateStr;

      System.out.println("\n--- School Data ---");
      System.out.print("School Name: ");
      String schoolName = scanner.nextLine();
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

      System.out.println("\n--- Teacher Data ---");
      System.out.print("Teacher Name: ");
      String teacherName = scanner.nextLine();
      System.out.print("Subject: ");
      String subject = scanner.nextLine();
      System.out.print("Teacher Email: ");
      String teacherEmail = scanner.nextLine();
      System.out.print("Teacher Phone: ");
      String phone = scanner.nextLine();

      System.out.println("\n--- Student Data ---");
      System.out.print("Student Name: ");
      String studentName = scanner.nextLine();
      System.out.print("Roll Number (>0): ");
      int rollNumber = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Grade: ");
      String grade = scanner.nextLine();
      System.out.print("Contact Number: ");
      String contactNumber = scanner.nextLine();

      System.out.println("\n--- Course Data ---");
      System.out.print("Course Name: ");
      String courseName = scanner.nextLine();
      System.out.print("Course Code: ");
      String courseCode = scanner.nextLine();
      System.out.print("Credit Hours (>0): ");
      int creditHours = scanner.nextInt();
      scanner.nextLine();

      System.out.println("\n--- Exam Data ---");
      System.out.print("Exam Name: ");
      String examName = scanner.nextLine();
      System.out.print("Max Marks (>0): ");
      int maxMarks = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Exam Date: ");
      String examDate = scanner.nextLine();

      System.out.println("\n--- Result Data ---");
      System.out.print("Obtained Marks (>=0): ");
      int obtainedMarks = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Remarks: ");
      String remarks = scanner.nextLine();

      System.out.println("\n--- Fee Data ---");
      System.out.print("Tuition Fee (>0): ");
      double tuitionFee = scanner.nextDouble();
      System.out.print("Exam Fee (>0): ");
      double examFee = scanner.nextDouble();

      StudentRecord record =
          new StudentRecord(
              id,
              createdDateStr,
              updatedDateStr,
              schoolName,
              address,
              phoneNumber,
              email,
              departmentName,
              departmentCode,
              teacherName,
              subject,
              teacherEmail,
              phone,
              studentName,
              rollNumber,
              grade,
              contactNumber,
              courseName,
              courseCode,
              creditHours,
              examName,
              maxMarks,
              examDate,
              obtainedMarks,
              remarks,
              tuitionFee,
              examFee);

      System.out.println("\n==============================================" + STUDENT_ID);
      System.out.println("Computed School Record Details" + STUDENT_ID);
      System.out.println("==============================================" + STUDENT_ID);
      System.out.println("School: " + record.getSchoolName() + ", " + record.getAddress());
      System.out.println("Student: " + record.getStudentName() + ", Grade: " + record.getGrade());
      System.out.println("Course: " + record.getCourseName() + ", Credits: " + record.getCreditHours());
      System.out.printf(
          "\n**CALCULATED AVERAGE MARKS**: %.2f%%" + STUDENT_ID, record.calculateAverageMarks());
      System.out.println("\n==============================================" + STUDENT_ID);

    } catch (SchoolDataException e) {
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
