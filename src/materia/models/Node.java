package materia.models;

public class Node {
    private int[] value; // Cambiamos el tipo de valor para que sea un arreglo de enteros
    private Node next;

    // Constructor que acepta un arreglo de enteros
    public Node(int[] value) {
        this.value = value;
        this.next = null;
    }

    // Getter y Setter para el valor
    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    // Getter y Setter para el siguiente nodo
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int val : value) {
            sb.append(val).append(" ");
        }
        return "node [value = " + sb.toString() + "]";
    }
}
