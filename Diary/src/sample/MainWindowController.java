package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import view.NoteViewerUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML
    private Button createBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private ListView notesListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void openNoteViewer(ActionEvent event){
        notesListView.getItems().add(new Label("New note"));
    }

    public void openNoteViewerOnClick(MouseEvent event) throws IOException {
        new NoteViewerUI().open();
    }
}
