package q6;

public class Transaction extends Customer {
  private String transactionId;
  private String transactionType;
  private double amount;

  public String getTransactionId() {
    return transactionId;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public double getAmount() {
    return amount;
  }

  public Transaction(
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
      String phoneNumber,
      String transactionId,
      String transactionType,
      double amount)
      throws BankingException {
    super(
        id,
        cDate,
        uDate,
        bankName,
        branchCode,
        address,
        accountNumber,
        accountType,
        balance,
        customerName,
        email,
        phoneNumber);
    if (amount <= 0) {
      throw new BankingException("Transaction amount must be > 0.");
    }
    this.transactionId = transactionId;
    this.transactionType = transactionType;
    this.amount = amount;
  }
}
