package lk.ijse.gdse.finalproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

    public Button btnStudents;
    public Button btnBooking;
    public Button btnCourses;
    public Button btnPayment;
    public Button btnInstructors;
    public Button btnLessons;
    public Button btnMaintainers;
    public Button btnVehicles;
    public Button btnSalary;
    public Button btnLogout;
    public Button btnSetting;
    public Label lblHomePage;
    public Rectangle rtgDashboard;
    public Label lblDashboard;
    public Label lblStudents;
    public Label lblInstructors;
    public Label lblBooking;
    public Label lblPayments;
    public Label lblCourses;
    public Label lblLessons;
    public Label lblMaintainer;
    public Label lblVehicles;
    public Label lblSalary;
    public Label lblSetting;
    public Label lblLogout;

    @FXML
    private Button btnDashboard;

    @FXML
    private AnchorPane loardAnchor;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    void dashboardOnAction(ActionEvent event) throws IOException {
        lblDashboard.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("DASHBOARD");
        navigateTo("/view/Dashboard.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            navigateTo("/view/Dashboard.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void navigateTo(String fxmlpath) throws IOException {
        loardAnchor.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlpath));
        loardAnchor.getChildren().add(load);
    }

    public void studentsOnAction(ActionEvent actionEvent) throws IOException {
        lblStudents.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE STUDENTS");
        navigateTo("/view/Students.fxml");
    }



    public void coursesOnAction(ActionEvent actionEvent) throws IOException {
        lblCourses.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE COURSES");
        navigateTo("/view/Courses.fxml");

    }



    public void instructorsOnAction(ActionEvent actionEvent) throws IOException {
        lblInstructors.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE INSTRUCTORS");
        navigateTo("/view/Instructors.fxml");

    }

    public void lessonsOnAction(ActionEvent actionEvent) throws IOException {
        lblLessons.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE LESSONS");
        navigateTo("/view/Lessons.fxml");

    }

    public void maintainersOnAction(ActionEvent actionEvent) throws IOException {
        lblMaintainer.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE MAINTAINERS");
        navigateTo("/view/Maintainers.fxml");

    }

    public void vehicleOnAction(ActionEvent actionEvent) throws IOException {
        lblVehicles.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE VEHICLES");
        navigateTo("/view/Vehicle.fxml");

    }

    public void salaryOnAction(ActionEvent actionEvent) throws IOException {
        lblSalary.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE SALARY");
        navigateTo("/view/Salary.fxml");

    }

    public void navigateToLogin(String fxmlpath) throws IOException {
        try {
            mainAnchor.getChildren().clear();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlpath));
            Parent load = loader.load();

            double preferredWidth = 900;
            double preferredHeight = 639;

            Stage currentStage = (Stage) mainAnchor.getScene().getWindow();

            currentStage.setWidth(preferredWidth);
            currentStage.setHeight(preferredHeight);

            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            currentStage.setX((screenBounds.getWidth() - preferredWidth) / 2);
            currentStage.setY((screenBounds.getHeight() - preferredHeight) / 2);

            Scene newScene = new Scene(load, preferredWidth, preferredHeight);
            currentStage.setScene(newScene);
            currentStage.setResizable(false);
            currentStage.show();
        }catch (IOException e){
            new Alert(Alert.AlertType.ERROR,"Fail UI").show();
        }
    }
    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        navigateToLogin("/view/LogIn.fxml");

    }

    public void settingOnAction(ActionEvent actionEvent) throws IOException {
        lblSetting.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("SETTING");
        navigateTo("/view/Setting.fxml");
    }

    public void bookingOnAction(ActionEvent actionEvent) throws IOException {
        lblBooking.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblPayments.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE BOOKING");
        navigateTo("/view/Booking.fxml");
    }

    public void paymentsOnAction(ActionEvent actionEvent) throws IOException {
        lblPayments.setStyle("-fx-background-color: #9e8496; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnPayment.setStyle("-fx-background-color: #9e8496; -fx-text-fill: #330a27;");

        lblDashboard.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnDashboard.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblStudents.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnStudents.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblCourses.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnCourses.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblInstructors.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnInstructors.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblLessons.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnLessons.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblMaintainer.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnMaintainers.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblVehicles.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnVehicles.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSalary.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSalary.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblSetting.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnSetting.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");

        lblBooking.setStyle("-fx-background-color: #ffffff; -fx-background-radius: 45; -fx-text-fill:  #330a27;");
        btnBooking.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #330a27;");
        lblHomePage.setText("MANAGE PAYMENTS");
        navigateTo("/view/Payment.fxml");
    }
}
