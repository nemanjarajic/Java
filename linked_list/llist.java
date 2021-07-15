package linked_list;
//import java.util.*;

  
public class llist {
    node head;
    node tail;
    llist(){
         this.head = null;
         this.tail = null;
    }

    public void addFront(int x){
        if(head == null){
            head = new node(x);
            tail = head;
        }else{
            node t = new node(x);
            t.next = head;
            head= t;
        }
    }

    public void addLast(int x){
        node t = new node(x);
        tail.next = t;
        tail = t;
    }

    public void reverse(){
        node curr = head, prev = null, nxt = null;

        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        head  = prev;
    }
    public void print(node x){
        System.out.println(x.val);
    }
    public void display(){
        node t = head;
        while(t != null){
            print(t);
            t = t.next;
        }
    }

    public static void main(String args[]){
        llist ll = new llist();

        ll.addFront(4);
        ll.addFront(3);
        ll.addFront(2);
        ll.addFront(1);

        ll.addLast(5);

        ll.reverse();
        
        ll.display();
    }
}
