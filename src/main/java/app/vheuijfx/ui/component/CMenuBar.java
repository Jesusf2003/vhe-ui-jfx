package app.vheuijfx.ui.component;

import app.vheuijfx.ui.view.EditorView;
import app.vheuijfx.ui.view.ToolBarView;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class CMenuBar extends MenuBar {

    private ToolBarView toolBarView;

    private Menu createMnFile() {
        Menu file = new Menu("File");
        MenuItem mniNew = new MenuItem("New");
        mniNew.setOnAction((_) -> {
            System.out.println("trying...");
            if (toolBarView != null) {
                toolBarView.setCenter(new EditorView());
            } else {
                System.out.println("Has been a error");
            }
        });
        MenuItem mniOpen = new MenuItem("Open...");
        MenuItem mniExit = new MenuItem("Exit");
        file.getItems().addAll(mniNew, mniOpen);
        file.getItems().add(new SeparatorMenuItem());
        // Show resents
        file.getItems().add(new SeparatorMenuItem());
        file.getItems().add(mniExit);
        return file;
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
