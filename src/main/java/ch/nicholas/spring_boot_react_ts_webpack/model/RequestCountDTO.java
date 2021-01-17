package ch.nicholas.spring_boot_react_ts_webpack.model;

import java.util.Date;

public class RequestCountDTO {

  private final int count;
  private final Date date;

  public RequestCountDTO(int count, Date date) {
    this.count = count;
    this.date = date;
  }

  public int getCount() {
    return count;
  }

  public Date getDate() {
    return date;
  }
}
