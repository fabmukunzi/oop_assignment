package q5;

public class Invoice extends Payment {
  private double totalCharge;

  public double getTotalCharge() {
    return totalCharge;
  }

  public Invoice(
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
      String transactionId,
      double totalCharge)
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
        penaltyCharge,
        paymentMode,
        transactionId);
    if (totalCharge <= 0) {
      throw new RentalException("Total charge must be > 0.");
    }
    this.totalCharge = totalCharge;
  }
}
