package q8;

public class Library extends Entity {
  private String libraryName;
  private String location;
  private String phoneNumber;

  public String getLibraryName() {
    return libraryName;
  }

  public String getLocation() {
    return location;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Library(
      int id, String cDate, String uDate, String libraryName, String location, String phoneNumber)
      throws LibraryException {
    super(id, cDate, uDate);
    if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
      throw new LibraryException("Phone number must be 10 digits.");
    }
    this.libraryName = libraryName;
    this.location = location;
    this.phoneNumber = phoneNumber;
  }
}
