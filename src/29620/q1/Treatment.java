package q1;

public class Treatment extends Admission {
  private String diagnosis;
  private String treatmentGiven;
  private double treatmentCost;

  public String getDiagnosis() {
    return diagnosis;
  }

  public String getTreatmentGiven() {
    return treatmentGiven;
  }

  public double getTreatmentCost() {
    return treatmentCost;
  }

  public Treatment(
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
      double treatCost)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone, nName, nShift, years, pName, pAge, pGender, pContact, aDate, rNumber, rCharges);

    if (treatCost <= 0) {
      throw new HospitalDataException("Treatment cost must be greater than 0.");
    }
    if (diag == null || diag.isEmpty() || treat == null || treat.isEmpty()) {
      throw new HospitalDataException("Diagnosis and treatment fields cannot be empty.");
    }

    this.diagnosis = diag;
    this.treatmentGiven = treat;
    this.treatmentCost = treatCost;
  }
}
