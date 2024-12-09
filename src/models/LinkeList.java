package Models;

import Materia.Models.NodeGeneric;

public class LinkedList<T> {
    private NodeGeneric<T> head; // Usar NodeGeneric aquí
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value) {
            return value;
      
    }

    public void deleteByValue(T value) {
    
    }

    public void print() {
   
    }

    public int getSize() {
        return size;
    }
}