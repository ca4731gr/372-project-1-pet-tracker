module project2.ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires com.opencsv;
    requires java.xml;
    requires org.jdom2;


    opens project2.ui to javafx.fxml;
    exports project2.ui;
    exports project2.controller to org.junit.platform.commons;
    opens project2.controller to javafx.fxml;
    opens project2.domain to javafx.fxml;
    exports project2.domain;
}