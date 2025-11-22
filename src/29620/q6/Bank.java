package q6;

public class Bank extends Entity {
  private String bankName;
  private String branchCode;
  private String address;

  public String getBankName() {
    return bankName;
  }

  public String getBranchCode() {
    return branchCode;
  }

  public String getAddress() {
    return address;
  }

  public Bank(
      int id, String cDate, String uDate, String bankName, String branchCode, String address)
      throws BankingException {
    super(id, cDate, uDate);
    if (branchCode == null || branchCode.length() < 3) {
      throw new BankingException("Branch code must be at least 3 characters.");
    }
    this.bankName = bankName;
    this.branchCode = branchCode;
    this.address = address;
  }
}
