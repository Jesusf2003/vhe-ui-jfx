package app.vheuijfx.ui.view;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class FooterView extends HBox {
    public FooterView() {
        getChildren().add(new Label(""));
        setHeight(50);
        setBackground(Background.fill(Color.WHITE));
    }
}
