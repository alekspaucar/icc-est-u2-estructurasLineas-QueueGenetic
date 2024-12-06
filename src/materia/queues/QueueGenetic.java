package materia.queues;
import materia.models.Node;
import java.util.Random;
import java.util.EmptyStackException;

public class QueueGenetic {
    private Node front; // Primer nodo de la cola
    private Node rear;  // Último nodo de la cola

    public QueueGenetic() {
        front = rear = null;
    }

    // Agregar un cromosoma a la cola
    public void enqueue(int[] cromosoma) {
        Node newNode = new Node(cromosoma);  // Crear nodo con cromosoma
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    // Eliminar un cromosoma de la cola
    public int[] dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int[] cromosoma = (int[]) front.getValue(); // Obtiene el cromosoma del primer nodo
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return cromosoma;
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Obtiene el cromosoma del primer elemento sin eliminarlo
    public int[] peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (int[]) front.getValue();
    }

    // Método para cruzar dos cromosomas
    public int[] cruzar(int[] cromosoma1, int[] cromosoma2) {
        Random rand = new Random();
        int puntoCruce = rand.nextInt(cromosoma1.length); // punto de cruce aleatorio
        int[] hijo = new int[cromosoma1.length];

        // Cruzar los cromosomas
        for (int i = 0; i < cromosoma1.length; i++) {
            if (i < puntoCruce) {
                hijo[i] = cromosoma1[i];
            } else {
                hijo[i] = cromosoma2[i];
            }
        }
        return hijo;
    }

    // Método para mutar un cromosoma
    public void mutar(int[] cromosoma) {
        Random rand = new Random();
        int index = rand.nextInt(cromosoma.length); // Selección aleatoria de un gen
        cromosoma[index] = cromosoma[index] == 0 ? 1 : 0; // Mutación: cambiar 0 por 1 o viceversa
    }

    // Imprimir todos los cromosomas en la cola
    public void printQueueGenetic() {
        Node aux = front;
        while (aux != null) {
            int[] cromosoma = (int[]) aux.getValue();
            for (int gene : cromosoma) {
                System.out.print(gene + " ");
            }
            System.out.println();
            aux = aux.getNext();
        }
    }

    // Obtener el tamaño de la cola
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
