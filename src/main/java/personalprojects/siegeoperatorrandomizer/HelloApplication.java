package personalprojects.siegeoperatorrandomizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/views/randomizer-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 812, 600);
        FileGeneration generation = new FileGeneration();
        stage.setTitle("Siege randomizer - " + generation.getTitle() );
        stage.setScene(scene);
        stage.show();
        HelloController controller = fxmlLoader.getController();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();


    }
}