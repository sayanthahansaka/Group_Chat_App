package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginWindow;
    public TextField txtUserName;

    public void loginOnAction(ActionEvent actionEvent)  {
        if (!txtUserName.getText().isEmpty()){
            ClientFormController.username = txtUserName.getText();
            Stage s1 = new Stage();
            /*Stage stage =(Stage) loginWindow.getScene().getWindow();*/
            try {
                s1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/ClientForm.fxml"))));
                s1.show();
            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}