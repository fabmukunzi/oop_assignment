package q8;

public class Section extends Library {
  private String sectionName;
  private String sectionCode;

  public String getSectionName() {
    return sectionName;
  }

  public String getSectionCode() {
    return sectionCode;
  }

  public Section(
      int id,
      String cDate,
      String uDate,
      String libraryName,
      String location,
      String phoneNumber,
      String sectionName,
      String sectionCode)
      throws LibraryException {
    super(id, cDate, uDate, libraryName, location, phoneNumber);
    if (sectionCode == null || sectionCode.length() < 3) {
      throw new LibraryException("Section code must be at least 3 characters.");
    }
    this.sectionName = sectionName;
    this.sectionCode = sectionCode;
  }
}
