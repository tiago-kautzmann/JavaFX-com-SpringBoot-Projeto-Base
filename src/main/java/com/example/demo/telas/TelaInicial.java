package com.example.demo.telas;

import com.example.demo.SpringInitializer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaInicial extends Stage {

    public TelaInicial() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SpringInitializer.class.getResource("/views/tela-inicial-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setTitle("Hello!");
        this.setScene(scene);
        this.show();
    }

}
