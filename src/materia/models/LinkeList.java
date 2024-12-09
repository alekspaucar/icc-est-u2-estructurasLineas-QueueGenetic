package materia.models.models;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import materia.models.NodeGeneric;
import org.w3c.dom.Node;

public class LinkeList <T>{
    private NodeGeneric <T> head;
    private int size=0;

    public void appendTotail(T value){
        if(head == null){
            head= new NodeGeneric<>(value),

        }else{
            NodeGeneric<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();

            }
            current.setNext(new NodeGeneric<>(value));

        }
        size++; 
    }
public void print(){
    if(head== nul){
        System.out.println("end");
        return;
        }
    NodeGeneric<T> turrent = head;
    while(current.getNext()!= null){
        System.out.println(current.getValue()+"--->");
        current = current.getNext();
    }
    System.out.println("end");
    }
    public LinkedList(NodeGeneric<T> head,int size){
        this.head = head;
        this.size = size;
    }
    public NodeGeneric<T> getHead() {
        return head;
    }
    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
public String tosString(){
    return "Linkelist [head- "+head+" size- "+size+"]";
    }
}
