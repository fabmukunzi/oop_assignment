package q10;

public class Category extends Store {
  private String categoryName;
  private String categoryCode;

  public String getCategoryName() {
    return categoryName;
  }

  public String getCategoryCode() {
    return categoryCode;
  }

  public Category(
      int id,
      String cDate,
      String uDate,
      String storeName,
      String address,
      String email,
      String categoryName,
      String categoryCode)
      throws ShoppingException {
    super(id, cDate, uDate, storeName, address, email);
    if (categoryCode == null || categoryCode.length() < 3) {
      throw new ShoppingException("Category code must be at least 3 characters.");
    }
    this.categoryName = categoryName;
    this.categoryCode = categoryCode;
  }
}
