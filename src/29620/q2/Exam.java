package q2;

public class Exam extends Course {
  private String examName;
  private int maxMarks;
  private String examDate;

  public String getExamName() {
    return examName;
  }

  public int getMaxMarks() {
    return maxMarks;
  }

  public String getExamDate() {
    return examDate;
  }

  public Exam(
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
      String examDate)
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
        creditHours);
    if (maxMarks <= 0) {
      throw new SchoolDataException("Max marks must be greater than 0.");
    }
    if (examDate == null || examDate.isEmpty()) {
      throw new SchoolDataException("Exam date cannot be empty.");
    }
    this.examName = examName;
    this.maxMarks = maxMarks;
    this.examDate = examDate;
  }
}
