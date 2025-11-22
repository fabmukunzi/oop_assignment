package q6;

public class Withdrawal extends Deposit {
  private double withdrawalAmount;
  private String withdrawalDate;

  public double getWithdrawalAmount() {
    return withdrawalAmount;
  }

  public String getWithdrawalDate() {
    return withdrawalDate;
  }

  public Withdrawal(
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
      String depositDate,
      double withdrawalAmount,
      String withdrawalDate)
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
        amount,
        depositAmount,
        depositDate);
    if (withdrawalAmount <= 0) {
      throw new BankingException("Withdrawal amount must be > 0.");
    }
    this.withdrawalAmount = withdrawalAmount;
    this.withdrawalDate = withdrawalDate;
  }
}
