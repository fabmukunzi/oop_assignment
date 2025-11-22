package q7;

public class Commission extends Payment {
  private double commissionRate;
  private double commissionAmount;

  public double getCommissionRate() {
    return commissionRate;
  }

  public double getCommissionAmount() {
    return commissionAmount;
  }

  public Commission(
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
      String terms,
      double paymentAmount,
      String paymentDate,
      double commissionRate,
      double commissionAmount)
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
        email,
        agreementDate,
        terms,
        paymentAmount,
        paymentDate);
    if (commissionRate < 0) {
      throw new RealEstateException("Commission rate must be >= 0.");
    }
    this.commissionRate = commissionRate;
    this.commissionAmount = commissionAmount;
  }
}
