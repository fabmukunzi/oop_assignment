package q5;

public class Branch extends Company {
  private String branchName;
  private String locationCode;

  public String getBranchName() {
    return branchName;
  }

  public String getLocationCode() {
    return locationCode;
  }

  public Branch(
      int id,
      String cDate,
      String uDate,
      String companyName,
      String address,
      String phoneNumber,
      String branchName,
      String locationCode)
      throws RentalException {
    super(id, cDate, uDate, companyName, address, phoneNumber);
    if (locationCode == null || locationCode.length() < 3) {
      throw new RentalException("Location code must be at least 3 characters.");
    }
    this.branchName = branchName;
    this.locationCode = locationCode;
  }
}
