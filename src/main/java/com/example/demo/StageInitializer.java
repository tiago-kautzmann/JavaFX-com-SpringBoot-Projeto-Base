package com.example.demo;

import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import com.example.demo.SpringInitializer.StageReadyEvent;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
    }

}
