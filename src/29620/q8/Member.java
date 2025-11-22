package q8;

public class Member extends Book {
  private String memberName;
  private int memberId;
  private String contactNumber;

  public String getMemberName() {
    return memberName;
  }

  public int getMemberId() {
    return memberId;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public Member(
      int id,
      String cDate,
      String uDate,
      String libraryName,
      String location,
      String phoneNumber,
      String sectionName,
      String sectionCode,
      String title,
      String author,
      String ISBN,
      String memberName,
      int memberId,
      String contactNumber)
      throws LibraryException {
    super(
        id,
        cDate,
        uDate,
        libraryName,
        location,
        phoneNumber,
        sectionName,
        sectionCode,
        title,
        author,
        ISBN);
    if (memberId <= 0) {
      throw new LibraryException("Member ID must be > 0.");
    }
    this.memberName = memberName;
    this.memberId = memberId;
    this.contactNumber = contactNumber;
  }
}
