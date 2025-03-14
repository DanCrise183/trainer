package ru.emelyanovm.trainer.domain.model;

public class OpenQuestionCard {
    private Long id;
    private String question;
    private String expectedAnswer;

    public OpenQuestionCard(Long id, String question, String expectedAnswer) {
        this.id = id;
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String answer) {
        return expectedAnswer.equalsIgnoreCase(answer.trim());
    }
}
