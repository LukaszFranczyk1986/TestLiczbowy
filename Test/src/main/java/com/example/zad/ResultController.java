package com.example.zad;


import com.example.zad.repository.Data;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {

    @FXML
    private Label lbl_result;


    public void initialize(){
        System.out.println(Data.result);
        lbl_result.setText(String.valueOf(Data.result));
    }


}
