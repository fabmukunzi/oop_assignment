package q5;

public class Rental extends Customer {
  private String rentalDate;
  private String returnDate;
  private int rentalDays;

  public String getRentalDate() {
    return rentalDate;
  }

  public String getReturnDate() {
    return returnDate;
  }

  public int getRentalDays() {
    return rentalDays;
  }

  public Rental(
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
      int rentalDays)
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
        contactNumber);
    if (rentalDays <= 0) {
      throw new RentalException("Rental days must be > 0.");
    }
    this.rentalDate = rentalDate;
    this.returnDate = returnDate;
    this.rentalDays = rentalDays;
  }
}
