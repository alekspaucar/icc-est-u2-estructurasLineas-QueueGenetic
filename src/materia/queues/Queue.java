package materia.queues;
import materia.models.Node;
import java.util.EmptyStackException;

public class Queue {
    private Node front; // Primer nodo de la cola
    private Node rear;  // Último nodo de la cola

    // Constructor: Inicializa la cola vacía
    public Queue() {
        front = rear = null;
    }

    // Agregar un valor a la cola
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // Si la cola está vacía
            front = rear = newNode;
        } else {
            rear.setNext(newNode); // Enlaza el nodo al final
            rear = newNode; // Actualiza el último nodo
        }
    }

    // Eliminar un valor de la cola
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = front.getValue(); // Obtiene el valor del primer nodo
        front = front.getNext(); // Mueve el front al siguiente nodo
        if (front == null) {
            rear = null; // Si la cola queda vacía, rear también debe ser null
        }
        return value;
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Obtiene el valor del primer elemento sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return front.getValue();
    }

    // Imprime todos los valores de la cola
    public void printQueue() {
        Node aux = front;
        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

    // Obtiene el tamaño de la cola
    public int getSize() {
        int size = 0;
        Node current = front;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
