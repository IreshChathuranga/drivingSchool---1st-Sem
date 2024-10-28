package lk.ijse.gdse.finalproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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

public class SignController implements Initializable {

    public Rectangle mianRactangle;
    @FXML
    private ImageView addressIcon;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSignup;

    @FXML
    private ImageView callIcon;

    @FXML
    private Text createTitle;

    @FXML
    private ImageView idIcon;

    @FXML
    private Text lettitle;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private ImageView mainImage;

    @FXML
    private Text mainTitle;

    @FXML
    private ImageView nameIcon;

    @FXML
    private ImageView passwordIcon;

    @FXML
    private ImageView secondImage;

    @FXML
    private Text textAccount;

    @FXML
    private Text textAdress;

    @FXML
    private Text textID;

    @FXML
    private Text textLarge;

    @FXML
    private Text textName;

    @FXML
    private Text textNumber;

    @FXML
    private Text textPassword;

    @FXML
    private Text textUnderline;

    @FXML
    private Text textUserName;

    @FXML
    private ImageView titelImage;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNumber;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private ImageView usernameIcon;



    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/LogIn.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void navigateTo(String fxmlpath) throws IOException {
        mainAnchor.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlpath));
        mainAnchor.getChildren().add(load);
    }

    public void signinOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/HomePage.fxml");
    }
}
