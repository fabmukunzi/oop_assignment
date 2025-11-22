package q7;

public class Payment extends Agreement {
  private double paymentAmount;
  private String paymentDate;

  public double getPaymentAmount() {
    return paymentAmount;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public Payment(
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
      String paymentDate)
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
        terms);
    if (paymentAmount <= 0) {
      throw new RealEstateException("Payment amount must be > 0.");
    }
    this.paymentAmount = paymentAmount;
    this.paymentDate = paymentDate;
  }
}
