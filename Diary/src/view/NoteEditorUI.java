package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NoteEditorUI {
    public void renameNote() {

    }

    public void loadNote() {

    }

    public void saveNote() {

    }

    public void revertChange() {

    }

    public void returnChange() {

    }

    public void exit() {

    }

    public void open() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/note editor UI.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
