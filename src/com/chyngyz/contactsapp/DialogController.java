package com.chyngyz.contactsapp;

import com.chyngyz.contactsapp.datamodel.Contact;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created by Chyngyz on 11/21/2020.
 */

public class DialogController {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextArea notesTextArea;

    public Contact getNewContact() {
        String firstName = firstNameTextField.getText().trim();
        String lastName = lastNameTextField.getText().trim();
        String phoneNumber = phoneNumberTextField.getText().trim();
        String notes = notesTextArea.getText().trim();

        return new Contact(firstName, lastName, phoneNumber, notes);
    }

    public void editContact(Contact contact) {
        firstNameTextField.setText(contact.getFirstName());
        lastNameTextField.setText(contact.getLastName());
        phoneNumberTextField.setText(contact.getPhoneNumber());
        notesTextArea.setText(contact.getNotes());
    }

    public void updateContact(Contact contact) {
        contact.setFirstName(firstNameTextField.getText().trim());
        contact.setLastName(lastNameTextField.getText().trim());
        contact.setPhoneNumber(phoneNumberTextField.getText().trim());
        contact.setNotes(notesTextArea.getText().trim());
    }
}
