package app.vheuijfx.ui.component.editor;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class C2DViewport extends BorderPane {

    private Canvas cnv;
    private static final int GRID_CELL_SIZE = 20;

    public C2DViewport() {
        setBackground(Background.fill(Color.BLACK));
        Label lblTitle = new Label("2D View");
        lblTitle.setTextFill(Color.WHITE);
        lblTitle.setMinWidth(50);
        lblTitle.setPadding(new Insets(5));
        setTop(lblTitle);

        cnv = new Canvas();
        cnv.widthProperty().bind(this.widthProperty());
        cnv.heightProperty().bind(this.heightProperty().subtract(lblTitle.heightProperty()));
        cnv.widthProperty().addListener(obs -> drawGrid());
        cnv.heightProperty().addListener(obs -> drawGrid());
        drawGrid();
        StackPane content = new StackPane(cnv);
        content.setBackground(Background.fill(Color.BLACK));
        setCenter(content);
    }

    private void drawGrid() {
        GraphicsContext gc = cnv.getGraphicsContext2D();
        gc.clearRect(0,0, cnv.getWidth(), cnv.getHeight());

        double width = cnv.getWidth();
        double height = cnv.getHeight();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width, height);
        gc.setStroke(Color.rgb(60,60,60,0.5));
        gc.setLineWidth(0.5);
        // Vertical lines
        for (double x = 0; x < width; x += GRID_CELL_SIZE) {
            gc.strokeLine(x, 0, x, height);
        }
        // Horizontal lines
        for (double y = 0; y < height; y += GRID_CELL_SIZE) {
            gc.strokeLine(0, y, width, y);
        }
        gc.setStroke(Color.web("#00CED1"));
        gc.setLineWidth(1.5);

        double centerX = width / 2;
        double centerY = height / 2;
        gc.strokeLine(0, centerY, width, centerY);
        gc.strokeLine(centerX, 0, centerX, height);
    }
}
