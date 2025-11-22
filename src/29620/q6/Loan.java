package q6;

public class Loan extends Withdrawal {
  private double loanAmount;
  private double interestRate;
  private int duration;

  public double getLoanAmount() {
    return loanAmount;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public int getDuration() {
    return duration;
  }

  public Loan(
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
      String withdrawalDate,
      double loanAmount,
      double interestRate,
      int duration)
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
        depositDate,
        withdrawalAmount,
        withdrawalDate);
    if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) {
      throw new BankingException("Loan amount, interest rate, and duration must be > 0.");
    }
    this.loanAmount = loanAmount;
    this.interestRate = interestRate;
    this.duration = duration;
  }
}
