package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainMenu;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
       new MainMenu().run(primaryStage);
       /* Parent root = FXMLLoader.load(getClass().getResource("main window UI.fxml"));
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void exit(){
        System.exit(0);
    }
}
