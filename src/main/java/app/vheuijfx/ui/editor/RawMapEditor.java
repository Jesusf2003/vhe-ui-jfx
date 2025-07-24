package app.vheuijfx.ui.editor;

import app.vheuijfx.ui.component.editor.C2DViewport;
import app.vheuijfx.ui.component.editor.C3DViewport;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class RawMapEditor extends GridPane {

    public RawMapEditor() {

        // Set padding and gaps between viewports
        setPadding(new Insets(2)); // Slight padding around the entire grid
        setHgap(2); // Horizontal gap between views
        setVgap(2); // Vertical gap between views

        // Define column constraints for 2 equal columns
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(col1, col2);

        // Define row constraints for 2 equal rows
        RowConstraints row1 = new RowConstraints();
        row1.setVgrow(Priority.ALWAYS);
        RowConstraints row2 = new RowConstraints();
        row2.setVgrow(Priority.ALWAYS);
        getRowConstraints().addAll(row1, row2);

        // Create and add the four viewports
        // Top-Left: 3D View
        C3DViewport view3D = new C3DViewport();
        GridPane.setConstraints(view3D, 0, 0); // Column 0, Row 0
        getChildren().add(view3D);

        // Top-Right: 2D Top View
        C2DViewport view2DTop = new C2DViewport();
        GridPane.setConstraints(view2DTop, 1, 0); // Column 1, Row 0
        getChildren().add(view2DTop);

        // Bottom-Left: 2D Front View
        C2DViewport view2DFront = new C2DViewport();
        GridPane.setConstraints(view2DFront, 0, 1); // Column 0, Row 1
        getChildren().add(view2DFront);

        // Bottom-Right: 2D Side View
        C2DViewport view2DSide = new C2DViewport();
        GridPane.setConstraints(view2DSide, 1, 1); // Column 1, Row 1
        getChildren().add(view2DSide);
    }
}