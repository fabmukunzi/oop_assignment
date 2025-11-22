package q1;

public class Doctor extends Department {
  private String doctorName;
  private String specialization;
  private String doctorEmail;
  private String phone;

  public String getDoctorName() {
    return doctorName;
  }

  public String getSpecialization() {
    return specialization;
  }

  public String getDoctorEmail() {
    return doctorEmail;
  }

  public String getPhone() {
    return phone;
  }

  public Doctor(
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
      String docPhone)
      throws HospitalDataException {
    super(id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode);

    if (spec == null || spec.isEmpty()) {
      throw new HospitalDataException("Specialization cannot be empty.");
    }
    if (docPhone == null
        || !docPhone.matches("\\d{10}")
        || docEmail == null
        || !docEmail.contains("@")) {
      throw new HospitalDataException("Invalid doctor email or phone (phone must be 10 digits).");
    }

    this.doctorName = docName;
    this.specialization = spec;
    this.doctorEmail = docEmail;
    this.phone = docPhone;
  }
}

