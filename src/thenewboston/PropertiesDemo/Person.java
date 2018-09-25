package thenewboston.PropertiesDemo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Person
 * Purpose: Person object class
 *
 * @author Denielle Kirk Abaquita
 * @version 6/29/18 @ 8:23 AM
 */

public class Person {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");      // property

    /**
     * Returns the firstName value
     */
    public String getFirstName() {
        return firstName.get();
    }

    /**
     * Returns the StringProperty object
     */
    public StringProperty firstNameProperty() {
        return firstName;
    }

    /**
     * Sets the first name value
     */
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
