
import java.io.Console;

import materia.models.models.Contact;
import views.ConsoleView;

public class MenuController {


public MenuController(){
    this.consoleView = new MenuController();

}
public void showMenu(){
    boolean exit= false;
    while (exit) {
        ConsoleView.displayMenu(){
            string option = ConsoleView.getInput("");
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
                    printList();
                    break;
                case "5":
                    exit=true;
                    ConsoleView.showMenssage("exiting.....");
                    break;


                default:
                ConsoleView.showMenssage("invaild option...");
                    break;
            }
        }
    }
    private void addContact(){
        string name= ConsoleView.getInput("enter name ");
        string phone = ConsoleView.getInput("enter name  ..");
        Contact<String,String> contact = new Contact<>(name,phone);
        ContactManager.addContact(contact);
        ConsoleView.showMenssage("contact added");

    }
    private void ContactManager(){
  
    }
}

}
