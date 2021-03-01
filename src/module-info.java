/**
 * Created by Chyngyz on 11/19/2020.
 */

module ContactsApp {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens com.chyngyz.contactsapp;
    opens com.chyngyz.contactsapp.datamodel;
}