package com.example.demo.controllers;

import com.example.demo.telas.TelaSecundaria;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class TelaInicialController {

    private TelaSecundaria telaSecundaria;

    public TelaInicialController(TelaSecundaria telaSecundaria) {
        this.telaSecundaria = telaSecundaria;
    }

    @FXML
    protected void onAbrirSecundariaButtonClick() {
        telaSecundaria.abrir();
    }

}
