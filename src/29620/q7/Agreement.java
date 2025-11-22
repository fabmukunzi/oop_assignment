package q7;

public class Agreement extends Buyer {
  private String agreementDate;
  private String terms;

  public String getAgreementDate() {
    return agreementDate;
  }

  public String getTerms() {
    return terms;
  }

  public Agreement(
      int id,
      String cDate,
      String uDate,
      String agencyName,
      String location,
      String phoneNumber,
      String agentName,
      String agentEmail,
      String licenseNumber,
      String propertyCode,
      String propertyType,
      double price,
      String sellerName,
      String contactNumber,
      String buyerName,
      String email,
      String agreementDate,
      String terms)
      throws RealEstateException {
    super(
        id,
        cDate,
        uDate,
        agencyName,
        location,
        phoneNumber,
        agentName,
        agentEmail,
        licenseNumber,
        propertyCode,
        propertyType,
        price,
        sellerName,
        contactNumber,
        buyerName,
        email);
    if (agreementDate == null || agreementDate.isEmpty() || terms == null || terms.isEmpty()) {
      throw new RealEstateException("Agreement date and terms cannot be empty.");
    }
    this.agreementDate = agreementDate;
    this.terms = terms;
  }
}
