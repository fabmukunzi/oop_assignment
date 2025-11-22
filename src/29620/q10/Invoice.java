package q10;

public class Invoice extends Shipping {
  private double totalAmount;

  public double getTotalAmount() {
    return totalAmount;
  }

  public Invoice(
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
      double shippingCost,
      double totalAmount)
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
        paymentStatus,
        shippingAddress,
        shippingCost);
    if (totalAmount <= 0) {
      throw new ShoppingException("Total amount must be > 0.");
    }
    this.totalAmount = totalAmount;
  }
}
