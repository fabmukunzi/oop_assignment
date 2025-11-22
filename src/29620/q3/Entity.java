package q3;

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

  public Entity(int id, String createdDateStr, String updatedDateStr) throws PayrollException {
    if (id <= 0) {
      throw new PayrollException("Entity ID must be greater than 0.");
    }
    if (createdDateStr == null || updatedDateStr == null) {
      throw new PayrollException("Dates cannot be null.");
    }
    try {
      this.createdDate = LocalDate.parse(createdDateStr);
      this.updatedDate = LocalDate.parse(updatedDateStr);
    } catch (DateTimeParseException e) {
      throw new PayrollException("Dates must be valid date strings (YYYY-MM-DD format).");
    }
    this.id = id;
  }
}
