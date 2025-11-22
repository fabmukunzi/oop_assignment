package q2;

public class Course extends Student {
  private String courseName;
  private String courseCode;
  private int creditHours;

  public String getCourseName() {
    return courseName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public int getCreditHours() {
    return creditHours;
  }

  public Course(
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
      int creditHours)
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
        contactNumber);
    if (creditHours <= 0) {
      throw new SchoolDataException("Credit hours must be greater than 0.");
    }
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.creditHours = creditHours;
  }
}
