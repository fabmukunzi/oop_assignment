package q10;

public class Shipping extends Payment {
  private String shippingAddress;
  private double shippingCost;

  public String getShippingAddress() {
    return shippingAddress;
  }

  public double getShippingCost() {
    return shippingCost;
  }

  public Shipping(
      int id,
      String cDate,
      String uDate,
      String storeName,
      String storeAddress,
      String email,
      String categoryName,
      String categoryCode,
      String productName,
      String productCode,
      double price,
      String customerName,
      String contactNumber,
      String address,
      String orderDate,
      String orderId,
      String paymentMethod,
      String paymentStatus,
      String shippingAddress,
      double shippingCost)
      throws ShoppingException {
    super(
        id,
        cDate,
        uDate,
        storeName,
        storeAddress,
        email,
        categoryName,
        categoryCode,
        productName,
        productCode,
        price,
        customerName,
        contactNumber,
        address,
        orderDate,
        orderId,
        paymentMethod,
        paymentStatus);
    if (shippingCost < 0) {
      throw new ShoppingException("Shipping cost must be >= 0.");
    }
    this.shippingAddress = shippingAddress;
    this.shippingCost = shippingCost;
  }
}
