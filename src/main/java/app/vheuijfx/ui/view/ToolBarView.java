package app.vheuijfx.ui.view;

import app.vheuijfx.ui.component.CToolBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ToolBarView extends BorderPane {

    public ToolBarView() {
        setBackground(Background.fill(Color.LIGHTGRAY));
        setTop(new CToolBar());
        setLeft(new ToolsView());
        setRight(new UtilsView());
    }
}
