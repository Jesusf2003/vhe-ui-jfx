package app.vheuijfx.ui.component.editor;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class C3DViewport extends BorderPane {

    public C3DViewport() {
        setBackground(Background.fill(Color.BLACK));
        Label lblTitle = new Label("3D View");
        lblTitle.setTextFill(Color.WHITE);
        lblTitle.setMinWidth(50);
        lblTitle.setPadding(new Insets(5));
        setTop(lblTitle);

        Group root3D = new Group();
        Box xAxis = new Box(100, 2, 2);
        xAxis.setMaterial(new PhongMaterial(Color.RED));
        xAxis.setTranslateX(50);

        Box yAxis = new Box(2, 100, 2);
        yAxis.setMaterial(new PhongMaterial(Color.GREEN));
        yAxis.setTranslateY(50);

        Box zAxis = new Box(2, 2, 100);
        zAxis.setMaterial(new PhongMaterial(Color.BLUE));
        zAxis.setTranslateZ(50);

        root3D.getChildren().addAll(xAxis, yAxis, zAxis);
        Box exampleBox = new Box(20, 20, 20);
        exampleBox.setMaterial(new PhongMaterial(Color.web("#DAA520"))); // Goldenrod color
        root3D.getChildren().add(exampleBox);

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(1000.0);
        camera.setTranslateX(-100); // Adjust camera position for initial view
        camera.setTranslateY(-100);
        camera.setTranslateZ(-200);

        // Lighting for the 3D scene
        PointLight light = new PointLight(Color.WHITE);
        light.setTranslateX(-100);
        light.setTranslateY(-100);
        light.setTranslateZ(-150);
        root3D.getChildren().add(light);

        // Create SubScene
        // Bind SubScene dimensions to parent (BorderPane's center)
        SubScene subScene = new SubScene(root3D, 200, 200, true, null); // Width/Height are initial, will bind later
        subScene.setFill(Color.BLACK); // Background of the 3D scene
        subScene.setCamera(camera);

        // Make SubScene resize with its parent
        subScene.widthProperty().bind(this.widthProperty());
        subScene.heightProperty().bind(this.heightProperty().subtract(lblTitle.heightProperty())); // Subtract title height

        // Put the SubScene into a StackPane to ensure it fills the center
        // and allow for easy placement of other elements if needed
        StackPane contentPane = new StackPane(subScene);
        contentPane.setBackground(Background.fill(Color.BLACK)); // Ensures black background
        setCenter(contentPane); // Place SubScene in the center
    }
}
