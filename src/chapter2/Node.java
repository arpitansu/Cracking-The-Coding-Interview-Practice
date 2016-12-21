package chapter2;

/**
 * Created by ruddu on 12/22/2016.
 */
public class Node {
    Node next = null;
    int data;

    public  Node(int d){
        data = d;
    }

    void addToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
