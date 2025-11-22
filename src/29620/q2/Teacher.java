package q2;

public class Teacher extends Department {
  private String teacherName;
  private String subject;
  private String teacherEmail;
  private String phone;

  public String getTeacherName() {
    return teacherName;
  }

  public String getSubject() {
    return subject;
  }

  public String getTeacherEmail() {
    return teacherEmail;
  }

  public String getPhone() {
    return phone;
  }

  public Teacher(
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
      String phone)
      throws SchoolDataException {
    super(
        id, cDate, uDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
    if (subject == null || subject.isEmpty()) {
      throw new SchoolDataException("Subject cannot be empty.");
    }
    if (teacherEmail == null
        || !teacherEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new SchoolDataException("Invalid teacher email format.");
    }
    if (phone == null || !phone.matches("\\d{10}")) {
      throw new SchoolDataException("Teacher phone must be 10 digits.");
    }
    this.teacherName = teacherName;
    this.subject = subject;
    this.teacherEmail = teacherEmail;
    this.phone = phone;
  }
}
