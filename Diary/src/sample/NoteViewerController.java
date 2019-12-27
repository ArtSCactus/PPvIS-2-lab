package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import view.NoteEditorUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteViewerController implements Initializable {
    @FXML
    private Button backBtn;
    @FXML
    private Button editBtn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void openNoteEditor() throws IOException {
        new NoteEditorUI().open();
    }
}
