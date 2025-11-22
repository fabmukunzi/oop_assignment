package q8;

public class Book extends Section {
  private String title;
  private String author;
  private String ISBN;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getISBN() {
    return ISBN;
  }

  public Book(
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
      String ISBN)
      throws LibraryException {
    super(id, cDate, uDate, libraryName, location, phoneNumber, sectionName, sectionCode);
    if (ISBN == null || ISBN.length() < 10) {
      throw new LibraryException("ISBN must be at least 10 characters.");
    }
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }
}
