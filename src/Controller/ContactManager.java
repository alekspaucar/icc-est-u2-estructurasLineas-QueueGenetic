package Controllers;

import Models.LinkedList;
import Models.Contact;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
            return null;
       
    }

    public void deleteContactByName(String name) {
 
    }

    public void printList() {
        contacts.print();
    }
}