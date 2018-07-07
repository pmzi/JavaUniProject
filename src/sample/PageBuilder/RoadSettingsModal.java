package sample.PageBuilder;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by pmzi on 7/7/2018.
 */
public class RoadSettingsModal {

    public <T> T show(){
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../Views/roadSettingsModal.fxml"));
        T controller = fxmlLoader.getController(); // Retrieve the controller
        try{

            Scene scene = new Scene(fxmlLoader.load(), 400, 300);
            Stage stage = new Stage();
            stage.setTitle("Road Settings");
            scene.getStylesheets().add("sample/assets/css/modal.css");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
            return controller;
        }catch (IOException e){
            e.printStackTrace();
        }

        return controller;

    }

}
