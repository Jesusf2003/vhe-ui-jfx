package app.vheuijfx.ui.view;

import app.vheuijfx.ui.editor.RawMapEditor;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class EditorView extends TabPane {

    private Tab createTabWithDot(String title) {
        Tab tab = new Tab();
        Circle redDot = new Circle(3.5);
        redDot.setFill(Color.RED);
        redDot.getStyleClass().add("tab-indicator-dot");

        Label tabTitle = new Label(title);
        tabTitle.getStyleClass().add("tab-label-text");

        HBox graphicContainer = new HBox(5);
        graphicContainer.setAlignment(Pos.CENTER_LEFT);
        graphicContainer.getChildren().addAll(redDot, tabTitle);

        tab.setGraphic(graphicContainer);
        tab.setText("");

        tab.setOnCloseRequest(event -> {
            System.out.println("Closing tab: " + title);
        });

        return tab;
    }

    public EditorView() {
        Tab fourway = createTabWithDot("Fourway");
        fourway.setContent(new RawMapEditor());
        getTabs().add(fourway);
        getSelectionModel().select(fourway);
    }
}
