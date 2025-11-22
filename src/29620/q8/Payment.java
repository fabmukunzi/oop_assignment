package q8;

public class Payment extends Fine {
  private String paymentDate;
  private String paymentMode;

  public String getPaymentDate() {
    return paymentDate;
  }

  public String getPaymentMode() {
    return paymentMode;
  }

  public Payment(
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
      int daysLate,
      String paymentDate,
      String paymentMode)
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
        returnDate,
        fineAmount,
        daysLate);
    if (paymentDate == null
        || paymentDate.isEmpty()
        || paymentMode == null
        || paymentMode.isEmpty()) {
      throw new LibraryException("Payment date and mode cannot be empty.");
    }
    this.paymentDate = paymentDate;
    this.paymentMode = paymentMode;
  }
}
