package ru.dancrise.storage;

import ru.dancrise.domain.model.OpenQuestionCard;
import ru.dancrise.domain.repo.QuestionRepository;

import java.util.*;

public class QuestionInMemoryStorage implements QuestionRepository {
  private final Map<String, OpenQuestionCard> question;

  public QuestionInMemoryStorage() {
    question = new HashMap<>();
  }

  @Override
  public List<OpenQuestionCard> findAll() {
    return question.values().stream().toList();
  }

  @Override
  public Optional<OpenQuestionCard> findByID(Long id) {
    OpenQuestionCard openQuestionCard = question.get(id);
    if (Objects.nonNull(openQuestionCard)) {
      return Optional.of(openQuestionCard);
    } else {
      return Optional.empty();
    }
  }

  @Override
  public void add(OpenQuestionCard task) {
    question.put(String.valueOf(task.getId()), task);
  }

  @Override
  public void update(OpenQuestionCard task) {
    question.put(String.valueOf(task.getId()), task);
  }

  @Override
  public void remove(String id) {
    question.remove(id);
  }
}
