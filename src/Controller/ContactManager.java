package controller;

import java.util.LinkedList;
import models.LinkedList;

public class ContactManager {

    private LinkedList<Contact<?,?>> contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();

    }
    public void addContact(Contact<?,?>contact){
        contacts.appendTotail(contact);
    }
}
