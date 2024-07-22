package fr.afpa.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    
    private StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    
    private StringProperty city = new SimpleStringProperty(this, "city", "");

    public Person(StringProperty firstName, StringProperty lastName, StringProperty city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
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
