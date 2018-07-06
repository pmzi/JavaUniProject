package sample.PageBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Views/main.fxml"));

        // load the tron font.
//        Font.loadFont(
//                Main.class.getResource("@assets/fonts/Avenir.otf").toExternalForm(),
//                10
//        );

        primaryStage.setTitle("Traffic Simulator");
        primaryStage.setResizable(false);
        Scene scene = new Scene(root, 600, 520);
        scene.getStylesheets().add("sample/assets/css/main.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void launchIt() {
        launch();
    }
}
