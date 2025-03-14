package ru.emelyanovm.trainer.domain.repo;

import ru.emelyanovm.trainer.domain.model.OpenQuestionCard;
import java.util.List;
import java.util.Optional;

public interface QuestionRepository {
    List<OpenQuestionCard> findAll();

    Optional<OpenQuestionCard> findById(Long id);

    void add(OpenQuestionCard task);

    void update(OpenQuestionCard task);

    void remove(Long id);
}