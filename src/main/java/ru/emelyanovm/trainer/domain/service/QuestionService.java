package ru.emelyanovm.trainer.domain.service;


import org.springframework.stereotype.Service;
import ru.emelyanovm.trainer.domain.model.OpenQuestionCard;
import ru.emelyanovm.trainer.domain.repo.QuestionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionRepository repository;

    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<OpenQuestionCard> getAll() {
        return repository.findAll();
    }

    public Optional<OpenQuestionCard> getById(Long id) {
        return repository.findById(id);
    }

    public boolean contains(OpenQuestionCard task) {
        return repository.findById(task.getId()).isPresent();
    }

    public void save(OpenQuestionCard task) {
        if (!isTaskInvalid(task)) {
            repository.add(task);
        }
    }

    public void delete(Long id) {
        repository.remove(id);
    }

    private boolean isTaskInvalid(OpenQuestionCard task) {
        return task.getQuestion() == null || task.getQuestion().isBlank();
    }
}
