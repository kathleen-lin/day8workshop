package day8revision;

import java.util.LinkedList;

public class LinkedListExample {
    

    public void example(){
        LinkedList<String> ll = new LinkedList<String>();
    
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");
        ll.add("H");

        System.out.println("original list");
        System.out.println(ll);

        ll.remove("C");
        System.out.println("After remove C");

        System.out.println(ll);

        ll.removeFirst();
        System.out.println("After remove first");
        System.out.println(ll);

        ll.removeLast();
        System.out.println("After remove last");
        System.out.println(ll);

        
    }
}
