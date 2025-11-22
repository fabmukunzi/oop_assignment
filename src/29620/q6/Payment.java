package q6;

public class Payment extends Loan {
  private double paymentAmount;
  private String paymentDate;

  public double getPaymentAmount() {
    return paymentAmount;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public Payment(
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
      int duration,
      double paymentAmount,
      String paymentDate)
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
        withdrawalDate,
        loanAmount,
        interestRate,
        duration);
    if (paymentAmount <= 0) {
      throw new BankingException("Payment amount must be > 0.");
    }
    this.paymentAmount = paymentAmount;
    this.paymentDate = paymentDate;
  }
}
