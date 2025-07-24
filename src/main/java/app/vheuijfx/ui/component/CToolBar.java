package app.vheuijfx.ui.component;

import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class CToolBar extends ToolBar {

    private Button createBtnToggleGrid() {
        return new Button("TG");
    }
    private Button createBtn3DGrid() {
        return new Button("3DG");
    }
    private Button createBtnLessGrid() {
        return new Button("-G");
    }
    private Button createBtnMoreGrid() {
        return new Button("+G");
    }
    // Separator
    private Button createBtnLWinState() {
        return new Button("LW");
    }
    private Button createBtnSWinState() {
        return new Button("SW");
    }
    // Separator
    private Button createBtnUtil1() {
        return new Button("B1");
    }
    // Separator
    private Button createBtnUtil2() {
        return new Button("B2");
    }
    private Button createBtnUtil3() {
        return new Button("B3");
    }
    private Button createBtnUtil4() {
        return new Button("B4");
    }
    // Separator
    private Button createBtnUtil5() {
        return new Button("B5");
    }
    private Button createBtnUtil6() {
        return new Button("B6");
    }
    private Button createBtnUtil7() {
        return new Button("B7");
    }
    // Separator
    private Button createBtnCut() {
        return new Button("C");
    }
    private Button createBtnCopy() {
        return new Button("C");
    }
    private Button createBtnPaste() {
        return new Button("P");
    }
    // Separator
    private Button createBtnUtil8() {
        return new Button("B8");
    }
    private Button createBtnUtil9() {
        return new Button("B9");
    }
    // Separator
    private Button createBtnUtil10() {
        return new Button("B10");
    }
    private Button createBtnUtil11() {
        return new Button("B11");
    }
    private Button createBtnUtil12() {
        return new Button("B12");
    }
    // Separator
    private Button createBtnUtil13() {
        return new Button("B13");
    }
    // Separator
    private Button createBtnRun() {
        return new Button("R");
    }

    public CToolBar() {
        setBackground(Background.fill(Color.WHITE));
        getItems().addAll(createBtnToggleGrid(), createBtn3DGrid(), createBtnLessGrid(), createBtnMoreGrid());
        getItems().add(new Separator());
        getItems().addAll(createBtnLWinState(), createBtnSWinState());
        getItems().add(new Separator());
        getItems().add(createBtnUtil1());
        getItems().add(new Separator());
        getItems().addAll(createBtnUtil2(), createBtnUtil3(), createBtnUtil4());
        getItems().add(new Separator());
        getItems().addAll(createBtnUtil5(), createBtnUtil6(), createBtnUtil7());
        getItems().add(new Separator());
        getItems().addAll(createBtnCut(), createBtnCopy(), createBtnPaste());
        getItems().add(new Separator());
        getItems().addAll(createBtnUtil8(), createBtnUtil9());
        getItems().add(new Separator());
        getItems().addAll(createBtnUtil10(), createBtnUtil11(), createBtnUtil12());
        getItems().add(new Separator());
        getItems().add(createBtnUtil13());
        getItems().add(new Separator());
        getItems().addAll(createBtnRun());
    }
}
