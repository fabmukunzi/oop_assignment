package q10;

public class Customer extends Product {
  private String customerName;
  private String contactNumber;
  private String address;

  public String getCustomerName() {
    return customerName;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public String getCustomerAddress() {
    return address;
  }

  public Customer(
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
      String address)
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
        price);
    if (customerName == null || customerName.isEmpty()) {
      throw new ShoppingException("Customer name cannot be empty.");
    }
    this.customerName = customerName;
    this.contactNumber = contactNumber;
    this.address = address;
  }
}
