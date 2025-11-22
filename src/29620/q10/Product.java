package q10;

public class Product extends Category {
  private String productName;
  private String productCode;
  private double price;

  public String getProductName() {
    return productName;
  }

  public String getProductCode() {
    return productCode;
  }

  public double getPrice() {
    return price;
  }

  public Product(
      int id,
      String cDate,
      String uDate,
      String storeName,
      String address,
      String email,
      String categoryName,
      String categoryCode,
      String productName,
      String productCode,
      double price)
      throws ShoppingException {
    super(id, cDate, uDate, storeName, address, email, categoryName, categoryCode);
    if (price <= 0) {
      throw new ShoppingException("Product price must be > 0.");
    }
    this.productName = productName;
    this.productCode = productCode;
    this.price = price;
  }
}
