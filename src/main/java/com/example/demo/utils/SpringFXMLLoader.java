package com.example.demo.utils;

import javafx.fxml.FXMLLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class SpringFXMLLoader {

    private final ApplicationContext context;

    public SpringFXMLLoader(ApplicationContext context) {
        this.context = context;
    }

    // Carrega um arquivo FXML para dentro do contexto do Spring
    public FXMLLoader load(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(context::getBean);
        try (InputStream fxmlStream = getClass().getResourceAsStream(fxmlPath)) {
            loader.load(fxmlStream);
        }
        return loader;
    }

}