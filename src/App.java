import Controllers.MenuController;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;
import Materia.Queues.Stacks.Stack;
import Materia.Queues.Stacks.StackGeneric;
import Models.Pantalla;

public class App {
    public static void main(String[] args) {

        runQueue();
        runQueueGeneric();
        runControllerMannager();
    }
    private static void runControllerMannager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

        System.out.println("");
        System.out.println("===============Estructuras Lineales==============");  
        runStack();
        runStackGeneric();
        runQueue();
        runQueueGeneric();
        MenuController menuController = new MenuController();
        menuController.showMenu();

    }

    public static void runStack() {

        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.println("Cantidad = " + stack.getSize());
        System.out.println(" ");
        //pila
        System.out.println("El tamaño de la pila es -> " + stack.getSize()); 
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize()); 
        System.out.println(" ");

    }

    public static void runStackGeneric() {
        
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/Home"));
        router.push(new Pantalla(2, "Menu Page", "/Home/menu"));
        router.push(new Pantalla(3, "Users Page", "/Home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        router.pop();
        System.out.println("Regreso a: " + router.peek().getRuta());
        System.out.println("Estoy en: " + router.peek().getRuta());

        router.push(new Pantalla(4, "Settings Page", "/Home/menu/settings"));
        System.out.println("Cantidad de pantallas: " + router.size());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printStack();
        System.out.println("\n");

    }

    public static void runQueue(){
            Queue cola = new Queue();

            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);

            System.out.println(cola.peek());
            System.out.println(cola.dequeue());
            System.out.println(cola.dequeue());
            System.out.println(cola.peek());
            System.out.println("\n");


    }

    public static void runQueueGeneric() {

    QueueGeneric<Pantalla> routerQueue = new QueueGeneric<>();


    routerQueue.enqueue(new Pantalla(1, "Home Page", "/Home"));
    routerQueue.enqueue(new Pantalla(2, "Menu Page", "/Home/menu"));
    routerQueue.enqueue(new Pantalla(3, "Users Page", "/Home/menu/users"));
    System.out.println("\n");


    System.out.println("Estado inicial de la cola:");
    routerQueue.printQueue();
    System.out.println("");



    System.out.println("Elemento al frente: " + routerQueue.peek().getRuta());
    System.out.println("Desencolar: " + routerQueue.dequeue().getRuta());
    System.out.println("Elemento al frente tras desencolar: " + routerQueue.peek().getRuta());
    System.out.println(" ");

    routerQueue.enqueue(new Pantalla(4, "Settings Page" , "/Home/menu/settings"));
    System.out.println("");

    System.out.println("final de la cola:");
    routerQueue.printQueue();
    System.out.println("Tamaño de la cola: " + routerQueue.size());
    System.out.println("");

    
    }
}