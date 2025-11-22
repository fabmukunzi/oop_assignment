package q1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Entity {
  private int id;
  private LocalDate createdDate;
  private LocalDate updatedDate;

  public int getId() {
    return id;
  }

  public String getCreatedDate() {
    return createdDate.toString();
  }

  public String getUpdatedDate() {
    return updatedDate.toString();
  }

  public Entity(int id, String createdDateStr, String updatedDateStr) throws HospitalDataException {
    if (id <= 0) {
      throw new HospitalDataException("Entity ID must be greater than 0.");
    }

    if (createdDateStr == null
        || updatedDateStr == null
        || createdDateStr.isEmpty()
        || updatedDateStr.isEmpty()) {
      throw new HospitalDataException("Dates cannot be null or empty.");
    }

    try {
      this.createdDate = LocalDate.parse(createdDateStr);
      this.updatedDate = LocalDate.parse(updatedDateStr);
    } catch (DateTimeParseException e) {
      throw new HospitalDataException("Dates must be valid date strings (YYYY-MM-DD format).");
    }

    this.id = id;
  }


}

