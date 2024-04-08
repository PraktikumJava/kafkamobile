package ru.practicum.lada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan(basePackages = "ru.practicum.lada")
@EnableScheduling
public class PracticumLada {

    public static void main(String[] args) {
        SpringApplication.run(PracticumLada.class, args);
    }
}
