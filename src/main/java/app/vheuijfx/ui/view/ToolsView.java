package app.vheuijfx.ui.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ToolsView extends VBox {

    private Button createBtnSelectT() {
        return new Button("ST");
    }
    private Button createBtnMagnifyT() {
        return new Button("M");
    }
    private Button createBtnCamT() {
        return new Button("C");
    }
    // Separator
    private Button createBtnEntT() {
        return new Button("E");
    }
    private Button createBtnBrushT() {
        return new Button("B");
    }
    // Separator
    private Button createBtnShowTextureAppT() {
        return new Button("T");
    }
    private Button createBtnApplyCurrentTextureT() {
        return new Button("A");
    }
    private Button createBtnApplyDecalT() {     // If is HL, show
        return new Button("D");
    }
    // Separator
    private Button createBtnClipT() {
        return new Button("C");
    }
    private Button createBtnVertexT() {
        return new Button("V");
    }
    // Separator
    private Button createBtnPathT() {           // If is HL, show
        return new Button("P");
    }

    public ToolsView() {
        setSpacing(10);
        setPadding(new Insets(10));
        setBackground(Background.fill(Color.WHITE));

        getChildren().addAll(createBtnSelectT(), createBtnMagnifyT(), createBtnCamT());
        getChildren().add(new Separator());
        getChildren().addAll(createBtnEntT(), createBtnBrushT());
        getChildren().add(new Separator());
        getChildren().addAll(createBtnShowTextureAppT(), createBtnApplyCurrentTextureT());
        getChildren().add(new Separator());
        getChildren().addAll(createBtnClipT(), createBtnVertexT());
    }
}
