package app.vheuijfx;

import app.vheuijfx.ui.view.FooterView;
import app.vheuijfx.ui.component.CMenuBar;
import app.vheuijfx.ui.view.ToolBarView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setBackground(Background.fill(Color.WHITE));
        ToolBarView tbv = new ToolBarView();
        root.setTop(new CMenuBar(tbv));
        root.setCenter(tbv);
        root.setBottom(new FooterView());
        Scene scene = new Scene(root, 900, 800);
        stage.setTitle("VHE - Solo UI");
        stage.setScene(scene);
        stage.setMinHeight(800);
        stage.setMinWidth(900);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}