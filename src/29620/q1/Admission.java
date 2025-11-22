package q1;

public class Admission extends Patient {
  private String admissionDate;
  private String roomNumber;
  private double roomCharges;

  public double getRoomCharges() {
    return roomCharges;
  }

  public Admission(
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
      double rCharges)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone, nName, nShift, years, pName, pAge, pGender, pContact);

    if (rCharges <= 0) {
      throw new HospitalDataException("Room charges must be greater than 0.");
    }
    if (aDate == null || aDate.isEmpty()) {
      throw new HospitalDataException("Admission date cannot be null.");
    }

    this.admissionDate = aDate;
    this.roomNumber = rNumber;
    this.roomCharges = rCharges;
  }

  
}

