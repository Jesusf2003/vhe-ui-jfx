module app.vheuijfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires java.desktop;

    opens app.vheuijfx to javafx.fxml;
    exports app.vheuijfx;
}