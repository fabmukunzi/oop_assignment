package q7;

public class Seller extends Property {
  private String sellerName;
  private String contactNumber;

  public String getSellerName() {
    return sellerName;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public Seller(
      int id,
      String cDate,
      String uDate,
      String agencyName,
      String location,
      String phoneNumber,
      String agentName,
      String email,
      String licenseNumber,
      String propertyCode,
      String propertyType,
      double price,
      String sellerName,
      String contactNumber)
      throws RealEstateException {
    super(
        id,
        cDate,
        uDate,
        agencyName,
        location,
        phoneNumber,
        agentName,
        email,
        licenseNumber,
        propertyCode,
        propertyType,
        price);
    if (sellerName == null || sellerName.isEmpty()) {
      throw new RealEstateException("Seller name cannot be empty.");
    }
    this.sellerName = sellerName;
    this.contactNumber = contactNumber;
  }
}
