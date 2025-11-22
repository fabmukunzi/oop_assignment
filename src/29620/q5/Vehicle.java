package q5;

public class Vehicle extends Branch {
  private String vehicleType;
  private String registrationNumber;
  private double dailyRate;

  public String getVehicleType() {
    return vehicleType;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public double getDailyRate() {
    return dailyRate;
  }

  public Vehicle(
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
      double dailyRate)
      throws RentalException {
    super(id, cDate, uDate, companyName, address, phoneNumber, branchName, locationCode);
    if (dailyRate <= 0) {
      throw new RentalException("Daily rate must be > 0.");
    }
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;
    this.dailyRate = dailyRate;
  }
}
