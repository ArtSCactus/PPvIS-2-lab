package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {
    public ListElement element;

    public void synchronizeWithServer() {

    }

    public void exitApplication() {

    }

    public void run(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/main window UI.fxml"));
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.show();
    }
}
