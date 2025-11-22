package q5;

public class Payment extends Charge {
  private String paymentMode;
  private String transactionId;

  public String getPaymentMode() {
    return paymentMode;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public Payment(
      int id,
      String cDate,
      String uDate,
      String companyName,
      String address,
      String phoneNumber,
      String branchName,
      String locationCode,
      String vehicleType,
      String registrationNumber,
      double dailyRate,
      String customerName,
      String licenseNumber,
      String contactNumber,
      String rentalDate,
      String returnDate,
      int rentalDays,
      double rentalCharge,
      double penaltyCharge,
      String paymentMode,
      String transactionId)
      throws RentalException {
    super(
        id,
        cDate,
        uDate,
        companyName,
        address,
        phoneNumber,
        branchName,
        locationCode,
        vehicleType,
        registrationNumber,
        dailyRate,
        customerName,
        licenseNumber,
        contactNumber,
        rentalDate,
        returnDate,
        rentalDays,
        rentalCharge,
        penaltyCharge);
    if (paymentMode == null
        || paymentMode.isEmpty()
        || transactionId == null
        || transactionId.isEmpty()) {
      throw new RentalException("Payment mode and transaction ID cannot be empty.");
    }
    this.paymentMode = paymentMode;
    this.transactionId = transactionId;
  }
}
