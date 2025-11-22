package q7;

public class Buyer extends Seller {
  private String buyerName;
  private String email;

  public String getBuyerName() {
    return buyerName;
  }

  public String getBuyerEmail() {
    return email;
  }

  public Buyer(
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
      String email)
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
        contactNumber);
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new RealEstateException("Invalid buyer email format.");
    }
    this.buyerName = buyerName;
    this.email = email;
  }
}
