package fr.afpa.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty city;

    public Person(String firstName, String lastName, String city) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.city = new SimpleStringProperty(city);
    }

    public StringProperty getFirstName() {
        return firstName;
    }

    public StringProperty getLastName() {
        return lastName;
    }

    public StringProperty getCity() {
        return city;
    }

    public void setFirstName(StringProperty firstName) {
        this.firstName = firstName;
    }

    public void setLastName(StringProperty lastName) {
        this.lastName = lastName;
    }

    public void setCity(StringProperty city) {
        this.city = city;
    }


    
}
