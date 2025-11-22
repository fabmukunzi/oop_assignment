package q10;

public class Order extends Customer {
  private String orderDate;
  private String orderId;

  public String getOrderDate() {
    return orderDate;
  }

  public String getOrderId() {
    return orderId;
  }

  public Order(
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
      String orderId)
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
        address);
    if (orderDate == null || orderDate.isEmpty() || orderId == null || orderId.isEmpty()) {
      throw new ShoppingException("Order date and ID cannot be empty.");
    }
    this.orderDate = orderDate;
    this.orderId = orderId;
  }
}
