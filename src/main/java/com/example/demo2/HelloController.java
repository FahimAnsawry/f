package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button Linbutton;

    @FXML
    private TextField aid;

    @FXML
    private Button cancelButton;

    @FXML
    private PasswordField pass;

    public HelloController(Button linbutton) {
        Linbutton = linbutton;
    }


    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}


