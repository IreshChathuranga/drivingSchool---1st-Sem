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
import lk.ijse.gdse.finalproject.dto.SigninDto;
import lk.ijse.gdse.finalproject.model.SigninModel;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
    SigninModel signinModel = new SigninModel();

    public void signinOnAction(ActionEvent actionEvent) throws IOException, SQLException, ClassNotFoundException {
        String name=txtName.getText();
        String userName=txtUserName.getText();
        int contactNumber= Integer.parseInt(txtNumber.getText());
        String userAddress=txtAddress.getText();
        String userPassword=txtPassword.getText();

        SigninDto signinDto= new SigninDto(
                name,
                userName,
                contactNumber,
                userAddress,
                userPassword
        );

        boolean isSaved=signinModel.saveAdmin(signinDto);
        if(isSaved){
            txtName.setText("");
            txtUserName.setText("");
            txtNumber.setText("");
            txtAddress.setText("");
            txtPassword.setText("");
        }
        navigateTo("/view/HomePage.fxml");
    }
}
