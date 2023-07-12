module com.example.epos {


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;
    requires com.jfoenix;
    requires java.sql;
    requires mysql.connector.j;


    opens com.goncalves.project to javafx.fxml;
    exports com.goncalves.project;
    exports com.goncalves.project.controller;
    opens com.goncalves.project.controller to javafx.fxml;
    exports com.goncalves.project.model;
    opens com.goncalves.project.model to javafx.fxml;
    exports com.goncalves.project.dao;
    opens com.goncalves.project.dao to javafx.fxml;
    exports com.goncalves.project.service;
    opens com.goncalves.project.service to javafx.fxml;
    exports com.goncalves.project.util;
    opens com.goncalves.project.util to javafx.fxml;
}