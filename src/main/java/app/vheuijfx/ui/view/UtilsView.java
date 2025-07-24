package app.vheuijfx.ui.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class UtilsView extends VBox {

    private VBox createVbxTextureArea() {
        VBox vbxRoot = new VBox();
        vbxRoot.setSpacing(10);
        vbxRoot.setPadding(new Insets(10));
        VBox vbxTextureFilter = new VBox();
        vbxTextureFilter.setSpacing(5);
        Label lblTextureGroup = new Label("Texture Group:");
        ComboBox<String> cmbTextureGroup = new ComboBox<>();
        cmbTextureGroup.setPrefWidth(195);
        cmbTextureGroup.getItems().add("All Textures");
        Label lblCurrentTexture = new Label("Current Texture:");
        ComboBox<String> cmbCurrentTexture = new ComboBox<>();
        cmbCurrentTexture.setPrefWidth(195);
        cmbCurrentTexture.getItems().add("WALL");
        vbxTextureFilter.getChildren().addAll(lblTextureGroup, cmbTextureGroup, lblCurrentTexture, cmbCurrentTexture);
        vbxRoot.getChildren().add(vbxTextureFilter);
        HBox hbxTextureSelect = new HBox();
        hbxTextureSelect.setSpacing(5);
        Pane pnTexturePreview = new Pane();
        pnTexturePreview.setBackground(Background.fill(Color.LIGHTGRAY));
        pnTexturePreview.setMinWidth(100);
        pnTexturePreview.setMinHeight(100);
        hbxTextureSelect.getChildren().add(pnTexturePreview);
        VBox vbxTextureOptions = new VBox();
        vbxTextureOptions.setSpacing(5);
        Label lblSize = new Label("64 x 64");
        lblSize.setAlignment(Pos.TOP_LEFT);
        Button btnBrowse = new Button("Browse...");
        btnBrowse.setPrefWidth(70);
        Button btnReplace = new Button("Replace...");
        btnReplace.setPrefWidth(70);
        vbxTextureOptions.getChildren().addAll(lblSize, btnBrowse, btnReplace);
        hbxTextureSelect.getChildren().add(vbxTextureOptions);
        vbxRoot.getChildren().add(hbxTextureSelect);
        return vbxRoot;
    }

    private VBox createVbxEBModifiers() {
        VBox vbxRoot = new VBox();
        vbxRoot.setSpacing(5);
        vbxRoot.setPadding(new Insets(10));
        HBox hbxMoveTo = new HBox();
        hbxMoveTo.setMinHeight(40);
        hbxMoveTo.setSpacing(5);
        hbxMoveTo.setAlignment(Pos.CENTER);
        Label lblMoveSelected = new Label("Move\nSelected:");
        lblMoveSelected.setMinHeight(30);
        Button btnToWorld = new Button("to World");
        btnToWorld.setPrefWidth(65);
        Button btnToEntity = new Button("to Entity");
        btnToEntity.setPrefWidth(65);
        hbxMoveTo.getChildren().addAll(lblMoveSelected, btnToWorld, btnToEntity);
        vbxRoot.getChildren().add(hbxMoveTo);
        Label lblCatg = new Label("Categories:");
        ComboBox<String> cmbCatg = new ComboBox<>();
        cmbCatg.setPrefWidth(195);
        cmbCatg.getItems().add("Primitives");
        Label lblObj = new Label("Objects:");
        ComboBox<String> cmbObj = new ComboBox<>();
        cmbObj.setPrefWidth(195);
        cmbObj.getItems().add("block");
        HBox hbxFaces = new HBox();
        hbxFaces.setSpacing(5);
        hbxFaces.setAlignment(Pos.CENTER);
        HBox hbxFace = new HBox();
        hbxFace.setSpacing(5);
        hbxFaces.setAlignment(Pos.CENTER);
        Label lblFaces = new Label("Faces:");
        Spinner<Integer> spnFaces = new Spinner<>();
        spnFaces.setPrefWidth(70);
        hbxFace.getChildren().addAll(lblFaces, spnFaces);
        HBox hbxPrefabs = new HBox();
        hbxPrefabs.setPadding(new Insets(10,0,0,0));
        hbxPrefabs.setAlignment(Pos.CENTER);
        Button btnCreatePrefab = new Button("Create Prefab");
        hbxPrefabs.getChildren().add(btnCreatePrefab);
        vbxRoot.getChildren().addAll(lblCatg, cmbCatg, lblObj, cmbObj, hbxFace, hbxPrefabs);
        return vbxRoot;
    }

    private VBox createVbxVisGroup() {
        VBox vbxRoot = new VBox();
        vbxRoot.setPadding(new Insets(10));
        vbxRoot.setSpacing(5);
        Label lblVis = new Label("VisGroups:");
        ListView<String> lvVisGroups = new ListView<>();
        lvVisGroups.setMinHeight(125);
        lvVisGroups.setMaxHeight(125);
        lvVisGroups.setPrefWidth(100);
        HBox hbxVisGroupsOptions = new HBox();
        hbxVisGroupsOptions.setAlignment(Pos.CENTER);
        hbxVisGroupsOptions.setSpacing(5);
        Button btnApply = new Button("Apply");
        Button btnEdit = new Button("Edit");
        Button btnMark = new Button("Mark");
        Button btnPurge = new Button("Purge");
        hbxVisGroupsOptions.getChildren().addAll(btnApply, btnEdit, btnMark, btnPurge);
        vbxRoot.getChildren().addAll(lblVis, lvVisGroups, hbxVisGroupsOptions);
        return vbxRoot;
    }

    public UtilsView() {
        setBackground(Background.fill(Color.WHITE));
        getChildren().add(createVbxTextureArea());
        getChildren().add(new Separator());
        getChildren().add(createVbxEBModifiers());
        getChildren().add(new Separator());
        getChildren().add(createVbxVisGroup());
    }
}
