package fr.afpa.controllers;

import java.io.IOException;

import fr.afpa.App;
import fr.afpa.models.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TableViewController {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField city;

    @FXML
    private Button save;

    @FXML
    private Button cancel;

    @FXML
    private Button clear;

    @FXML
    private TableColumn colFirstName;

    @FXML
    private TableColumn colLastName;

    @FXML
    private TableColumn colCity;

    private ObservableList<Person> persons = FXCollections.observableArrayList();

    @FXML
    public void delete(ActionEvent e) {
        System.out.println("bim");
    }

    @FXML
    public void initialize() {

       // TODO ajouter le code d'initiliasation de la vue
       
    }

}
