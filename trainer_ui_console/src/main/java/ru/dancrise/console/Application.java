package ru.dancrise.console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.dancrise.console.config.SpringConfig;
import ru.dancrise.console.controller.ConsoleController;


import javax.sql.DataSource;
public class Application {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    ConsoleController controller = context.getBean(ConsoleController.class);
    controller.interactWithUser();
  }
}






