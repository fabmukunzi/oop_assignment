package q1;

public class Bill extends Treatment {
  private double doctorFee;
  private double medicineCost;

  public double getDoctorFee() {
    return doctorFee;
  }

  public double getMedicineCost() {
    return medicineCost;
  }

  public double getTotalBill() {
    return getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
  }

  public Bill(
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
      double treatCost,
      double dFee,
      double mCost)
      throws HospitalDataException {
    super(
        id, cDate, uDate, hName, addr, hPhone, hEmail, dName, dCode, docName, spec, docEmail,
        docPhone, nName, nShift, years, pName, pAge, pGender, pContact, aDate, rNumber, rCharges,
        diag, treat, treatCost);

    if (dFee <= 0 || mCost <= 0) {
      throw new HospitalDataException("Doctor fee and medicine cost must be greater than 0.");
    }

    this.doctorFee = dFee;
    this.medicineCost = mCost;
  }
}

