package lk.ijse.gdse.finalproject.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardController {

    public Button btbInstructor;
    public Button btnStudent;
    public Button btnMaintainer;
    public Button btnVehicles;
    public AnchorPane dashAnchor;

    public void instructorOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Instructors.fxml");
    }

    public void studentOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Students.fxml");
    }

    public void maintainerOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Maintainers.fxml");
    }

    public void vehicleOnAction(ActionEvent actionEvent) throws IOException {
        navigateTo("/view/Vehicle.fxml");
    }
    public void navigateTo(String fxmlpath) throws IOException {
        dashAnchor.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlpath));
        dashAnchor.getChildren().add(load);
    }
}
