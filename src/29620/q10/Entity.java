package q10;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Entity {
  private int id;
  private LocalDate createdDate;
  private LocalDate updatedDate;

  public int getId() {
    return id;
  }

  public String getCreatedDateStr() {
    return createdDate.toString();
  }

  public String getUpdatedDateStr() {
    return updatedDate.toString();
  }

  public Entity(int id, String createdDateStr, String updatedDateStr) throws ShoppingException {
    if (id <= 0) {
      throw new ShoppingException("Entity ID must be greater than 0.");
    }
    try {
      this.createdDate = LocalDate.parse(createdDateStr);
      this.updatedDate = LocalDate.parse(updatedDateStr);
    } catch (DateTimeParseException e) {
      throw new ShoppingException("Dates must be valid date strings (YYYY-MM-DD format).");
    }
    this.id = id;
  }
}
