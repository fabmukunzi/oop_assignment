package q6;

public class Customer extends Account {
  private String customerName;
  private String email;
  private String phoneNumber;

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Customer(
      int id,
      String cDate,
      String uDate,
      String bankName,
      String branchCode,
      String address,
      String accountNumber,
      String accountType,
      double balance,
      String customerName,
      String email,
      String phoneNumber)
      throws BankingException {
    super(id, cDate, uDate, bankName, branchCode, address, accountNumber, accountType, balance);
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new BankingException("Invalid email format.");
    }
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new BankingException("Phone number must be 10 digits.");
    }
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }
}
