package Controllers;

import Models.Contact; // Importamos la clase Contact
import Views.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) { 
            consoleView.displayMenu();
            String option = consoleView.getInput("Choose the option: ");
    
            switch (option) {
                case "1": 
                    addContact();
                    break;
                case "2": 
                    findContact();
                    break;
                case "3": 
                    deleteContact();
                    break;
                case "4": 
                    contactManager.printList();
                    break;
                case "5": 
                    exit = true;
                    consoleView.showMessage("Exiting.......");
                    break;
                default:
                    consoleView.showMessage("Invalid option.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Name the contact: ");
        String phone = consoleView.getInput("phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact add.");
    }

    private void findContact() {
        String name = consoleView.getInput("Name the contact: ");
        Contact<String, String> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contact find: " + contact);
        } else {
            consoleView.showMessage("Contact not find.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Name contact to delete: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("deleted contact");
    }
}