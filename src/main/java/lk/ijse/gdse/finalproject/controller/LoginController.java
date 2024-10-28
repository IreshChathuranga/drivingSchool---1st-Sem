package lk.ijse.gdse.finalproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSignin;

    @FXML
    private Text helloTitle;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private ImageView mainImage;

    @FXML
    private Rectangle mainRactangle;

    @FXML
    private Text mainTitle;

    @FXML
    private ImageView passwordIcon;

    @FXML
    private ImageView secondImage;

    @FXML
    private Text textAccount;

    @FXML
    private Text textLarge;

    @FXML
    private Text textPassword;

    @FXML
    private Text textUnderline;

    @FXML
    private Text textUserName;

    @FXML
    private ImageView titelImage;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private ImageView usernameIcon;

    @FXML
    private Text welcometitle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //navigateTo("/view/SignIn.fxml");
    }

    public void loginOnAction(ActionEvent actionEvent) {
        navigateTo("/view/HomePage.fxml");
    }

    public void signinOnAction(ActionEvent actionEvent) {
        navigateTo("/view/SignIn.fxml");
    }

    public void navigateTo(String fxlmpath) {
        try {
            mainAnchor.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxlmpath));
            mainAnchor.getChildren().add(load);
        }catch (IOException e){
            new Alert(Alert.AlertType.ERROR,"Fail UI").show();
        }
    }
}
