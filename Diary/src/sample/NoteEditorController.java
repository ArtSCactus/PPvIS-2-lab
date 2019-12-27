package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import view.NoteEditorUI;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NoteEditorController implements Initializable {
    @FXML
    private Button backBtn;
    @FXML
    private Button revertChangeBtn;
    @FXML
    private Button returnChangeBtn;
    @FXML
    private TextField titleField;
    @FXML
    private Button saveBtn;
    @FXML
    private TextArea noteContentArea;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void doAction(ActionEvent event) throws IOException {
        new NoteEditorUI().open();
    }

}
