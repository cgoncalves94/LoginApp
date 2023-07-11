module com.example.epos {


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;
    requires com.jfoenix;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.epos to javafx.fxml;
    exports com.example.epos;
    exports com.example.epos.controller;
    opens com.example.epos.controller to javafx.fxml;
    exports com.example.epos.model;
    opens com.example.epos.model to javafx.fxml;
    exports com.example.epos.dao;
    opens com.example.epos.dao to javafx.fxml;
    exports com.example.epos.service;
    opens com.example.epos.service to javafx.fxml;
    exports com.example.epos.util;
    opens com.example.epos.util to javafx.fxml;
}