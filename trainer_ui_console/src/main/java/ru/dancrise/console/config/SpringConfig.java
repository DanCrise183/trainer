package ru.dancrise.console.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import ru.dancrise.spring.jdbc.config.DbConfig;


@Configuration
@Import(DbConfig.class)
@ComponentScan(basePackages = "ru.dancrise")
@PropertySource("jdbc.properties")
public class SpringConfig {

}
