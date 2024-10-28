package lk.ijse.gdse.finalproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

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
    @FXML
    private Button btnDashboard;

    @FXML
    private AnchorPane loardAnchor;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    void dashboardOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Dashboard.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void navigateTo(String fxmlpath) throws IOException {
        loardAnchor.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlpath));
        loardAnchor.getChildren().add(load);
    }

    public void studentsOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Students.fxml");
    }

    public void bookingOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Booking.fxml");

    }

    public void coursesOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Courses.fxml");

    }

    @FXML
    void paymentOnAction(ActionEvent event) throws IOException {
        navigateTo("/view/Payment.fxml");
    }

    public void instructorsOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Instructors.fxml");

    }

    public void lessonsOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Lessons.fxml");

    }

    public void maintainersOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Maintainers.fxml");

    }

    public void vehicleOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Maintainers.fxml");

    }

    public void salaryOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Salary.fxml");

    }

    public void navigateToLogin(String fxmlpath) throws IOException {
        mainAnchor.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlpath));
        mainAnchor.getChildren().add(load);
    }
    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        navigateToLogin("/view/LogIn.fxml");

    }
}
