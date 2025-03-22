package ru.dancrise.domain.model;

import ru.dancrise.domain.utility.ValidationUtil;

import java.time.ZonedDateTime;

public class OpenQuestionCard {
  private final long id;
  private String title;
  private String description;
  private ZonedDateTime deadLine;

  public OpenQuestionCard(long id, String title) {
    if (id <= 0) {
      throw new IllegalArgumentException("id должен быть положительным числом");
    }
    ValidationUtil.validateNotEmpty(title, "title не может быть пустым");
    this.id = id;
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    ValidationUtil.validateNotEmpty(title, "title не может быть пустым");
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ZonedDateTime getDeadLine() {
    return deadLine;
  }

  public void setDeadLine(ZonedDateTime deadLine) {
    if (ZonedDateTime.now().isAfter(deadLine)) {
      throw new IllegalArgumentException("deadLine не может быть в прошлом");
    }
    this.deadLine = deadLine;
  }

  @Override
  public String toString() {
    return "question{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", deadLine=" + deadLine +
            '}';
  }
}
