package materia.stacks;
import java.util.EmptyStackException;
import materia.models.Node;


public class Stacks {
    private Node top;//nodo en la cima de nuestra pila
    //creamos la pila con la cima nula o vacia 
    public Stacks(){
        this.top=null;
    }
    public void push(int value){
        Node newNode = new Node(value);
         newNode.setNext(top);
         top  = newNode;   
    }
    //metodo que retira el node de la cima.
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if(isEmpty()){
                throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printStacks(){
        Node aux=top;
        while (aux != null){
            System.out.println(aux.getValue());
            aux=aux.getNext();
        }
    }
    public int getSize(){
        int size = 0;
        Node current = top;
        while(current!= null){
            size++;
            current=current.getNext();
        } 
        return size;
    }
}
