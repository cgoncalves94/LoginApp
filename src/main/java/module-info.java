module com.example.epos {


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;
    requires com.jfoenix;
    requires java.sql;


    opens com.example.epos to javafx.fxml;
    exports com.example.epos;
}