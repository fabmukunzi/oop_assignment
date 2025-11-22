package q1;

public class Nurse extends Doctor {
  private String nurseName;
  private String shift;
  private int yearsOfExperience;

  public String getNurseName() {
    return nurseName;
  }

  public String getShift() {
    return shift;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public Nurse(
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
      int years)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone);

    if (!"Day".equalsIgnoreCase(nShift) && !"Night".equalsIgnoreCase(nShift)) {
      throw new HospitalDataException("Shift must be 'Day' or 'Night'.");
    }
    if (years < 0) {
      throw new HospitalDataException("Years of experience must be >= 0.");
    }

    this.nurseName = nName;
    this.shift = nShift;
    this.yearsOfExperience = years;
  }
}
