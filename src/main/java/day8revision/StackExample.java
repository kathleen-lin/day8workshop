package day8revision;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    
    public void example(){

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println("stack size: " + stack.size());

        for (int i = 0; i < 5; i++){
            stack.pop();
        }
        
        System.out.println("After pop: " + stack);

        Integer top = stack.peek();
        System.out.println("Top of the stack is: " + top);

        Integer bottom = stack.firstElement();
        System.out.println("Bottom (first element) of the stack is: " + bottom);

        Integer index = stack.search(0);
        System.out.println("0 is at index" + index);

        index = stack.search(1);
        System.out.println("1 is at index" + index);

        index = stack.search(2);
        System.out.println("2 is at index" + index);

        index = stack.search(3);
        System.out.println("3 is at index" + index);

        index = stack.search(4);
        System.out.println("4 is at index" + index);

        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()){
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }

    }
}
