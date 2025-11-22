package q1;

public class Patient extends Nurse {
  private String patientName;
  private int age;
  private String gender;
  private String contactNumber;

  public String getPatientName() {
    return patientName;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public Patient(
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
      String pContact)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone, nName, nShift, years);

    if (pAge <= 0) {
      throw new HospitalDataException("Patient age must be greater than 0.");
    }
    if (!"Male".equalsIgnoreCase(pGender)
        && !"Female".equalsIgnoreCase(pGender)
        && !"Other".equalsIgnoreCase(pGender)) {
      throw new HospitalDataException("Gender must be 'Male', 'Female', or 'Other'.");
    }

    this.patientName = pName;
    this.age = pAge;
    this.gender = pGender;
    this.contactNumber = pContact;
  }
}
