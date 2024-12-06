import materia.queues.QueueGenetic;

public class App {
    public static void main(String[] args) throws Exception {
        runQueueGenetic();
    }

    public static void runQueueGenetic() {
        QueueGenetic queueGenetic = new QueueGenetic();
        
        // Crear cromosomas y agregarlos a la cola
        queueGenetic.enqueue(new int[]{1, 0, 1, 0, 1});
        queueGenetic.enqueue(new int[]{0, 1, 0, 1, 0});
        
        // Imprimir la cola
        System.out.println("Cola genética antes de cruzamiento y mutación:");
        queueGenetic.printQueueGenetic();
        
        // Cruzar dos cromosomas
        int[] cromosoma1 = queueGenetic.dequeue();
        int[] cromosoma2 = queueGenetic.dequeue();
        int[] hijo = queueGenetic.cruzar(cromosoma1, cromosoma2);
        System.out.println("\nCromosoma cruzado:");
        for (int gene : hijo) {
            System.out.print(gene + " ");
        }
        System.out.println();
        
        // Mutar el cromosoma hijo
        queueGenetic.mutar(hijo);
        System.out.println("\nCromosoma mutado:");
        for (int gene : hijo) {
            System.out.print(gene + " ");
        }
        System.out.println();
    }
}

