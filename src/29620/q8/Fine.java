package q8;

public class Fine extends Borrow {
  private double fineAmount;
  private int daysLate;

  public double getFineAmount() {
    return fineAmount;
  }

  public int getDaysLate() {
    return daysLate;
  }

  public Fine(
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
      String returnDate,
      double fineAmount,
      int daysLate)
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
        contactNumber,
        borrowDate,
        returnDate);
    if (fineAmount < 0) {
      throw new LibraryException("Fine amount must be >= 0.");
    }
    this.fineAmount = fineAmount;
    this.daysLate = daysLate;
  }
}
