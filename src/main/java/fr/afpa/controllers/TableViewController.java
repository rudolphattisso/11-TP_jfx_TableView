package fr.afpa.controllers;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.afpa.App;
import fr.afpa.models.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableViewController {

    private static Logger logger = LogManager.getLogger(App.class);

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField cityField;

    @FXML
    private Button save;

    @FXML
    private Button cancel;

    @FXML
    private Button clear;

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> colFirstName;

    @FXML
    private TableColumn<Person, String> colLastName;

    @FXML
    private TableColumn<Person, String> colCity;

    private ObservableList<Person> persons = FXCollections.observableArrayList();

    @FXML
    public void delete(ActionEvent e) {
        logger.info("bim");
    }

    @FXML
    public void initialize() {
        persons.add(new Person("Josh", "Homme", "Bordeaux"));
        persons.add(new Person("Dave", "Grohl", "Paris"));
        persons.add(new Person("Robert", "Trujillo", "Blois"));

        tableView.setItems(persons); // LINK

        colFirstName.setCellValueFactory(cellData -> cellData.getValue().getFirstName());
        colLastName.setCellValueFactory(cellData -> cellData.getValue().getLastName());
        colCity.setCellValueFactory(cellData -> cellData.getValue().getCity());

    }
    // Sauvegarde les nouvelles données dans le modèle (création d'une nouvelle
    // personne et ajout à l'"ObservableList").

    @FXML
    public void save(ActionEvent event) {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String city = cityField.getText();

        

        if (!firstName.isEmpty() && !lastName.isEmpty() && !city.isEmpty()) {
            Person person = new Person(firstName, lastName, city);
            persons.add(person);
            
        }

    }


    @FXML
    public void cancel(ActionEvent event) {//effacer les champs de textes
        firstNameField.clear();
        lastNameField.clear();
        cityField.clear();
    }

    @FXML
    public void clear(ActionEvent event) {
        Person personToDelete=tableView.getSelectionModel().getSelectedItem();// recuperation de l'objet à supprimer
        persons.remove(personToDelete); // suppression de la personne
    }

}
