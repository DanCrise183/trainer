package ru.emelyanovm.trainer;

import ru.emelyanovm.trainer.domain.model.OpenQuestionCard;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Создаём карточку с вопросом и ожидаемым ответом
        OpenQuestionCard card = new OpenQuestionCard("Что такое Java?", "Язык программирования");

        System.out.println("Викторина: ответьте на вопрос.");
        System.out.println(card.getQuestion());

        // Считываем ответ пользователя
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        // Проверяем ответ
        if (card.checkAnswer(userAnswer)) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно! Ожидаемый ответ: " + card.checkAnswer(userAnswer));
        }

        scanner.close();
    }
}
