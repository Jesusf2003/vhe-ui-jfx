package app.vheuijfx;

import app.vheuijfx.ui.view.FooterView;
import app.vheuijfx.ui.component.CMenuBar;
import app.vheuijfx.ui.view.ToolBarView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setTop(new CMenuBar(stage));
        root.setCenter(new ToolBarView());
        root.setBottom(new FooterView());
        Scene scene = new Scene(root, 700, 800);
        stage.setTitle("VHE - Solo UI");
        stage.setScene(scene);
        stage.setMinHeight(800);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}