package q7;

public class Agent extends Agency {
  private String agentName;
  private String email;
  private String licenseNumber;

  public String getAgentName() {
    return agentName;
  }

  public String getEmail() {
    return email;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }

  public Agent(
      int id,
      String cDate,
      String uDate,
      String agencyName,
      String location,
      String phoneNumber,
      String agentName,
      String email,
      String licenseNumber)
      throws RealEstateException {
    super(id, cDate, uDate, agencyName, location, phoneNumber);
    if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
      throw new RealEstateException("Invalid email format.");
    }
    this.agentName = agentName;
    this.email = email;
    this.licenseNumber = licenseNumber;
  }
}
