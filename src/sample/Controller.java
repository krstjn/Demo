package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller{
    @FXML
    private Label myMessage;
    @FXML
    private Label myMsg;
    @FXML
    private Button btnEng;
    @FXML
    private Button btnIS;
    @FXML
    private JFXButton clickMe;
    @FXML
    private JFXButton pushMe;

    private ResourceBundle bundle;
    private Locale locale;
    private int count1 = 0;
    private int count2 = 0;

    public void printMe(ActionEvent e){
        System.out.println("jei");
        myMessage.setText(++count1 + "");
    }
    public void printMe2(ActionEvent e){
        System.out.println("jei");
        myMsg.setText(++count2 + "");
    }
    @FXML
    private void btnIS(ActionEvent e){
        System.out.println("en");
        loadLang("is");
    }
    @FXML
    private void btnEng(ActionEvent e){
        System.out.println("drasl");
        loadLang("en_US");
    }
    public void loadLang(String lang){
        locale = new Locale(lang);
        bundle = ResourceBundle.getBundle("message", locale);
        System.out.println(bundle.getString("button.en"));
        btnEng.setText(bundle.getString("button.en"));
        btnIS.setText(bundle.getString("button.is"));
        clickMe.setText(bundle.getString("button.press"));
        pushMe.setText(bundle.getString("button.press"));

    }

}
