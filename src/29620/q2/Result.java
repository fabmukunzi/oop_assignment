package q2;

public class Result extends Exam {
  private int obtainedMarks;
  private String remarks;

  public int getObtainedMarks() {
    return obtainedMarks;
  }

  public String getRemarks() {
    return remarks;
  }

  public Result(
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
      String remarks)
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
        examDate);
    if (obtainedMarks < 0) {
      throw new SchoolDataException("Obtained marks must be >= 0.");
    }
    if (remarks == null || remarks.isEmpty()) {
      throw new SchoolDataException("Remarks cannot be empty.");
    }
    this.obtainedMarks = obtainedMarks;
    this.remarks = remarks;
  }
}
