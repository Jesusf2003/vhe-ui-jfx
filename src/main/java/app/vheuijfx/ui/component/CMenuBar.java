package app.vheuijfx.ui.component;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CMenuBar extends MenuBar {

    private Stage stg;

    private Menu createMnFile() {
        Menu file = new Menu("File");
        MenuItem mniNew = new MenuItem("New");
        MenuItem mniOpen = new MenuItem("Open...");
        // Separator
        // Recent menu
        // Separator
        MenuItem mniExit = new MenuItem("Exit");
        file.getItems().addAll(mniNew, mniOpen, mniExit);
        return file;
    }

    private Menu createMnTools() {
        Menu tools = new Menu("Tools");
        MenuItem mniPrefabFactory = new MenuItem("Prefab Factory...");
        MenuItem mniOptions = new MenuItem("Options...");
        tools.getItems().addAll(mniPrefabFactory, mniOptions);
        return tools;
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

    public CMenuBar(Stage stg) {
        this.stg = stg;
        setBackground(Background.fill(Color.WHITE));
        getMenus().addAll(createMnFile(), createMnTools(), createMnHelp());
    }
}
