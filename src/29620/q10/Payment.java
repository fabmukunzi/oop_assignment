package q10;

public class Payment extends Order {
  private String paymentMethod;
  private String paymentStatus;

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public String getPaymentStatus() {
    return paymentStatus;
  }

  public Payment(
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
      String paymentStatus)
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
        orderId);
    if (paymentMethod == null
        || paymentMethod.isEmpty()
        || paymentStatus == null
        || paymentStatus.isEmpty()) {
      throw new ShoppingException("Payment method and status cannot be empty.");
    }
    this.paymentMethod = paymentMethod;
    this.paymentStatus = paymentStatus;
  }
}
