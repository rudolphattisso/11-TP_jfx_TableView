module fr.afpa {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires org.apache.logging.log4j;

    opens fr.afpa to javafx.fxml;
    opens fr.afpa.controllers to javafx.fxml;
    exports fr.afpa;
    exports fr.afpa.models;
    exports fr.afpa.controllers;
}
