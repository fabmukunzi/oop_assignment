package q6;

public class Deposit extends Transaction {
  private double depositAmount;
  private String depositDate;

  public double getDepositAmount() {
    return depositAmount;
  }

  public String getDepositDate() {
    return depositDate;
  }

  public Deposit(
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
      double amount,
      double depositAmount,
      String depositDate)
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
        phoneNumber,
        transactionId,
        transactionType,
        amount);
    if (depositAmount <= 0) {
      throw new BankingException("Deposit amount must be > 0.");
    }
    this.depositAmount = depositAmount;
    this.depositDate = depositDate;
  }
}
