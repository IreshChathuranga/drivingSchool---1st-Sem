package lk.ijse.gdse.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/LogIn.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("learn Drive");
        Image image = new Image(getClass().getResourceAsStream("/images/pexels-taras-makarenko-188506-593172.jpg"));
        stage.getIcons().add(image);
        stage.show();
    }
}