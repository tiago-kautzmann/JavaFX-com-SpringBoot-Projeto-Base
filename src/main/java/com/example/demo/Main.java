package com.example.demo;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        Application.launch(Initializer.class, args);
    }

}
