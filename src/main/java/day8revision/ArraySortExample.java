package day8revision;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void arraysort () {
        
        String name[] = { "today", "is", "going", "to", "be", "great"};

        System.out.println("Unsorted arr: " + Arrays.toString(name));
        
        Arrays.sort(name);

        System.out.println("Sorted arr: " + Arrays.toString(name));

        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Sorted arr (desc): " + Arrays.toString(name));

    }

    public void sortint(){
        Integer numbers[] = {10, 4, 6, 1, 2, 8, 9, 7, 3};
        System.out.println("Unsorted arr: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted arr: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted arr: " + Arrays.toString(numbers));

    }
    
    
}
