package ru.emelyanovm.trainer.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenQuestionCardTest {

    @Test
    void shouldCreateCardSuccessfully() {
        OpenQuestionCard card = new OpenQuestionCard("Что такое OOP?", "Объектно-ориентированное программирование");
        assertEquals("Что такое OOP?", card.getQuestion());
    }

    @Test
    void shouldThrowExceptionIfQuestionIsNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new OpenQuestionCard(null, "Ответ"));
        assertEquals("Вопрос не может быть пустым или null", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionIfExpectedAnswerIsNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new OpenQuestionCard("Вопрос", null));
        assertEquals("Ожидаемый ответ не может быть пустым или null", exception.getMessage());
    }

    @Test
    void checkAnswerShouldReturnTrueForCorrectAnswer() {
        OpenQuestionCard card = new OpenQuestionCard("Что такое Java?", "Язык программирования");
        assertTrue(card.checkAnswer("Язык программирования"));
    }

    @Test
    void checkAnswerShouldReturnFalseForIncorrectAnswer() {
        OpenQuestionCard card = new OpenQuestionCard("Что такое Java?", "Язык программирования");
        assertFalse(card.checkAnswer("Кофе"));
    }

    @Test
    void checkAnswerShouldIgnoreCaseAndTrim() {
        OpenQuestionCard card = new OpenQuestionCard("Что такое Java?", "Язык программирования");
        assertTrue(card.checkAnswer("  язык программирования  "));
    }
}
