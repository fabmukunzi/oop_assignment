package q4;

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

  public Entity(int id, String createdDateStr, String updatedDateStr) throws HotelException {
    if (id <= 0) {
      throw new HotelException("Entity ID must be greater than 0.");
    }
    if (createdDateStr == null || updatedDateStr == null) {
      throw new HotelException("Dates cannot be null.");
    }
    try {
      this.createdDate = LocalDate.parse(createdDateStr);
      this.updatedDate = LocalDate.parse(updatedDateStr);
    } catch (DateTimeParseException e) {
      throw new HotelException("Dates must be valid date strings (YYYY-MM-DD format).");
    }
    this.id = id;
  }
}
