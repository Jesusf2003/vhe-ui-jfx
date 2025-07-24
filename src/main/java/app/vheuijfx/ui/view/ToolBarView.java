package app.vheuijfx.ui.view;

import app.vheuijfx.ui.component.CToolBar;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class ToolBarView extends BorderPane {
    public ToolBarView() {
        setBackground(Background.fill(Color.LIGHTGRAY));
        setTop(new CToolBar());
        setLeft(new ToolsView());
        setRight(new UtilsView());
    }
}
