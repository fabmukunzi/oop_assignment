package q10;

public class Store extends Entity {
  private String storeName;
  private String address;
  private String email;

  public String getStoreName() {
    return storeName;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public Store(int id, String cDate, String uDate, String storeName, String address, String email)
      throws ShoppingException {
    super(id, cDate, uDate);
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new ShoppingException("Invalid email format.");
    }
    this.storeName = storeName;
    this.address = address;
    this.email = email;
  }
}
