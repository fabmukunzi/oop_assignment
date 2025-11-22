package q6;

public class Account extends Bank {
  private String accountNumber;
  private String accountType;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountType() {
    return accountType;
  }

  public double getBalance() {
    return balance;
  }

  public Account(
      int id,
      String cDate,
      String uDate,
      String bankName,
      String branchCode,
      String address,
      String accountNumber,
      String accountType,
      double balance)
      throws BankingException {
    super(id, cDate, uDate, bankName, branchCode, address);
    if (balance < 0) {
      throw new BankingException("Balance must be >= 0.");
    }
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
  }
}
