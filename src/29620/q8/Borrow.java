package q8;

public class Borrow extends Member {
  private String borrowDate;
  private String returnDate;

  public String getBorrowDate() {
    return borrowDate;
  }

  public String getReturnDate() {
    return returnDate;
  }

  public Borrow(
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
      String contactNumber,
      String borrowDate,
      String returnDate)
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
        ISBN,
        memberName,
        memberId,
        contactNumber);
    if (borrowDate == null || borrowDate.isEmpty() || returnDate == null || returnDate.isEmpty()) {
      throw new LibraryException("Borrow and return dates cannot be empty.");
    }
    this.borrowDate = borrowDate;
    this.returnDate = returnDate;
  }
}
