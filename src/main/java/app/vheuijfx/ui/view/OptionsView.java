package app.vheuijfx.ui.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OptionsView extends Stage {

    private Tab settingTabs(String title, Node node) {
        Tab tab = new Tab(title);
        tab.setClosable(false);
        tab.setContent(node);
        return tab;
    }
    // Temporal
    private HBox addArea() {
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        TextField txtf = new TextField();
        txtf.setPrefWidth(275);
        Button btn = new Button("Browse...");
        btn.setPrefWidth(75);
        hbox.getChildren().addAll(txtf, btn);
        return hbox;
    }

    private Tab createGameConfig() {
        VBox root = new VBox();
        root.setSpacing(5);
        root.setPadding(new Insets(10));
        Label lblConfig = new Label("Configuration:");
        HBox hbxConfig = new HBox();
        hbxConfig.setSpacing(5);
        ComboBox<String> cmbConfig = new ComboBox<>();
        cmbConfig.setPrefWidth(250);
        cmbConfig.getItems().add("Quake");
        Button btnEdit = new Button("Edit");
        btnEdit.setPrefWidth(105);
        hbxConfig.getChildren().addAll(cmbConfig, btnEdit);
        root.getChildren().addAll(lblConfig, hbxConfig);

        Label lblGameDataFile = new Label("Game Data files:");
        HBox hbxGameDataFile = new HBox();
        hbxGameDataFile.setSpacing(5);
        ListView<String> lvsGameDataFile = new ListView<>();
        lvsGameDataFile.setPrefWidth(250);
        lvsGameDataFile.setMaxHeight(100);
        VBox vbxGameDataOptions = new VBox();
        vbxGameDataOptions.setSpacing(5);
        HBox hbxAddEdit = new HBox();
        hbxAddEdit.setSpacing(5);
        Button btnAddGDFile = new Button("Add");
        btnAddGDFile.setPrefWidth(50);
        Button btnEditGDFile = new Button("Edit");
        btnEditGDFile.setPrefWidth(50);
        hbxAddEdit.getChildren().addAll(btnAddGDFile, btnEditGDFile);
        Button btnRemoveGDFile = new Button("Remove");
        btnRemoveGDFile.setPrefWidth(105);
        vbxGameDataOptions.getChildren().addAll(hbxAddEdit, btnRemoveGDFile);
        hbxGameDataFile.getChildren().addAll(lvsGameDataFile, vbxGameDataOptions);

        GridPane gpMapDetail = new GridPane();

        root.getChildren().addAll(lblGameDataFile, hbxGameDataFile);

        return settingTabs("Game Configurations", root);
    }

    private Tab createBuildPrograms() {
        VBox root = new VBox();
        root.setSpacing(5);
        root.setPadding(new Insets(10));
        Label lblConfig = new Label("Configuration:");
        ComboBox<String> cmbConfig = new ComboBox<>();
        cmbConfig.setPrefWidth(375);
        cmbConfig.getItems().add("Quake");
        Label lblDescription = new Label("Select the build and game execs for this game configuration:");
        lblDescription.setAlignment(Pos.TOP_LEFT);
        lblDescription.setPrefHeight(50);
        root.getChildren().addAll(lblConfig, cmbConfig, lblDescription);

        Label lblRawMap = new Label("Place compiled maps in this directory\nbefore running the game:");
        lblRawMap.setPrefHeight(55);

        root.getChildren().addAll(new Label("Game executable:"), addArea());
        root.getChildren().addAll(new Label("CSG executable:"), addArea());
        root.getChildren().addAll(new Label("BSP executable:"), addArea());
        root.getChildren().addAll(new Label("VIS executable:"), addArea());
        root.getChildren().addAll(new Label("RAD executable:"), addArea());
        root.getChildren().addAll(lblRawMap, addArea());
        return settingTabs("Build Programs", root);
    }

    private TabPane tbpRoot() {
        TabPane root = new TabPane();
        root.setPrefWidth(350);
        root.getTabs().addAll(createGameConfig(), createBuildPrograms());
        return root;
    }

    private HBox createFooter() {
        HBox root = new HBox();
        root.setAlignment(Pos.CENTER_RIGHT);
        root.setSpacing(5);
        root.setPadding(new Insets(10));
        return root;
    }

    public OptionsView(Node e) {
        BorderPane bpRoot = new BorderPane();
        bpRoot.setPadding(new Insets(10));
        bpRoot.setCenter(tbpRoot());
        bpRoot.setBottom(createFooter());
        Scene root = new Scene(bpRoot, 400, 500);
        setScene(root);
        setIconified(false);
        setTitle("Configure VHE Editor");
        setResizable(false);
        initModality(Modality.APPLICATION_MODAL);
        initOwner(e.getScene().getWindow());
        showAndWait();
    }
}
