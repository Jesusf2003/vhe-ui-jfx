package app.vheuijfx.ui.component;

import app.vheuijfx.ui.editor.RawMapEditor;
import app.vheuijfx.ui.view.EditorView;
import app.vheuijfx.ui.view.OptionsView;
import app.vheuijfx.ui.view.ToolBarView;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class CMenuBar extends MenuBar {

    private ToolBarView toolBarView;
    private boolean isEditorOpened = false;
    private Menu mnFile;

    private Menu createMnFile() {
        mnFile = new Menu("File");
        MenuItem mniNew = createMniNew();
        MenuItem mniOpen = new MenuItem("Open...");
        MenuItem mniExit = new MenuItem("Exit");
        mnFile.getItems().addAll(mniNew, mniOpen);
        mnFile.getItems().add(new SeparatorMenuItem());
        mnFile.getItems().add(new SeparatorMenuItem());
        mnFile.getItems().add(mniExit);
        return mnFile;
    }
    private MenuItem createMniNew() {
        MenuItem mniNew = new MenuItem("New");
        mniNew.setOnAction((_) -> {
            if (!isEditorOpened) {
                getMenus().add(1, createMnEdit());
                getMenus().add(2, createMnMap());
                getMenus().add(4, createMnWindow());
                mnFile.getItems().add(1, createMniClose());
                isEditorOpened = true;
            }
            if (toolBarView != null) {
                toolBarView.setCenter(new RawMapEditor());
            } else {
                System.out.println("Has been a error");
            }
        });
        return mniNew;
    }
    private MenuItem createMniClose() {
        MenuItem mniClose = new MenuItem("Close");
        mniClose.setOnAction((_) -> {
            if (toolBarView != null) {
                toolBarView.setCenter(new BorderPane());
            }
        });
        return mniClose;
    }

    private Menu createMnEdit() {
        return new Menu("Edit");
    }

    private Menu createMnMap() {
        return new Menu("Map");
    }

    private Menu createMnTools() {
        Menu tools = new Menu("Tools");
        MenuItem mniPrefabFactory = new MenuItem("Prefab Factory...");
        MenuItem mniOptions = new MenuItem("Options...");
        mniOptions.setOnAction(_ -> {
            new OptionsView(toolBarView);
        });
        tools.getItems().addAll(mniPrefabFactory, mniOptions);
        return tools;
    }

    private Menu createMnWindow() {
        return new Menu("Window");
    }

    private Menu createMnHelp() {
        Menu help = new Menu("Help");
        MenuItem mniHelpTopics = new MenuItem("Help Topics");

        Menu mnWebResources = new Menu("Web Resources");
        MenuItem mniResCenter = new MenuItem("VHE Resources Center");
        MenuItem mniDiscussForum = new MenuItem("VHE Discussion Forum");
        MenuItem mniToolsSupportMail = new MenuItem("VHE Tools Support Mail");
        mnWebResources.getItems().addAll(mniResCenter, new SeparatorMenuItem(), mniDiscussForum, new SeparatorMenuItem(), mniToolsSupportMail);

        MenuItem mniAbout = new MenuItem("About...");
        help.getItems().addAll(mniHelpTopics, mnWebResources);
        help.getItems().add(new SeparatorMenuItem());
        help.getItems().add(mniAbout);
        return help;
    }

    public CMenuBar(ToolBarView toolBarView) {
        this.toolBarView = toolBarView;
        setBackground(Background.fill(Color.WHITE));
        getMenus().addAll(createMnFile(), createMnTools(), createMnHelp());
    }
}
