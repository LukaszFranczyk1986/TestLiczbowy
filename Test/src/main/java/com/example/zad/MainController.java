package com.example.zad;

import com.example.zad.repository.Data;
import com.example.zad.service.ResultService;
import com.example.zad.service.impl.ResultServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {

    private ResultService resultService;

    public MainController() {
        resultService = new ResultServiceImpl();
    }

    @FXML
    private AnchorPane anchor_fragment;

    @FXML
    private TextField txt_numbers;
    @FXML
    void btn_searchNumber(ActionEvent event) throws IOException {
        Long[] numberList = resultService.convertStringToNumberList(txt_numbers.getText());
        if(numberList.length < 3){
        showAlert("Popraw wprowadzone liczby !","Błąd danych");
        }
        else{
            Data.result = resultService.findNumber(numberList);
            AnchorPane result = FXMLLoader.load(getClass().getResource("result.fxml"));
            anchor_fragment.getChildren().setAll(result);

        }
    }

    public void showAlert(String message, String title) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }

}