package ru.emelyanovm.trainer.domain.model;

public class OpenQuestionCard {
    private final String question;
    private final String expectedAnswer;

    public OpenQuestionCard(String question, String expectedAnswer) {
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Вопрос не может быть пустым или null");
        }
        if (expectedAnswer == null || expectedAnswer.trim().isEmpty()) {
            throw new IllegalArgumentException("Ожидаемый ответ не может быть пустым или null");
        }
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String answer) {
        if (answer == null) {
            return false;
        }
        return expectedAnswer.equalsIgnoreCase(answer.trim());
    }
}
