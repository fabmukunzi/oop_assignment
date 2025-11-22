package q7;

public class Property extends Agent {
  private String propertyCode;
  private String propertyType;
  private double price;

  public String getPropertyCode() {
    return propertyCode;
  }

  public String getPropertyType() {
    return propertyType;
  }

  public double getPrice() {
    return price;
  }

  public Property(
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
      double price)
      throws RealEstateException {
    super(id, cDate, uDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
    if (price <= 0) {
      throw new RealEstateException("Property price must be > 0.");
    }
    this.propertyCode = propertyCode;
    this.propertyType = propertyType;
    this.price = price;
  }
}
