package view;

import entity.Note;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NoteEditor;

import java.io.IOException;

public class NoteViewerUI {

    private NoteEditor editor;

    public void editNote() throws IOException {
        editor = new NoteEditor("", "", new String[]{}, new Note("", "", ""));
        new NoteEditorUI().open();
    }

    public void loadNote(String name) {

    }

    public void exit() {

    }

    public void open() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/note viewer UI.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.showAndWait();
    }

}
