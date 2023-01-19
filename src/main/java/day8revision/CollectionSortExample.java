package day8revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {
    
    public void collectionsort(){
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){

            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("collections");

        System.out.println("Unsorted list: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        /*
        Alternative:
        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());

        System.out.println("Sorted list (desc): " + numbers);
 */
    }

    public void example02(){
        Employee emp1 = new Employee("zanxin", "yang zanxin", "zx", "female lead", "yzx@zx.com", 8500);
        Employee emp2 = new Employee("baiyin", "gu baiyin", "zx", "male lead", "gby@zx.com", 8000);
        Employee emp3 = new Employee("rufei", "he yan", "njx", "female lead", "hy@njx.com", 10500);
        Employee emp4 = new Employee("huaijin", "xiao jue", "njx", "male lead", "xhj@njx.com", 10000);
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("employees before sorting: " + employees);

        System.out.println("");
        
        Collections.sort(employees);
        // this will sort by employee name because employee's compareTo deals with employee full name
        System.out.println("employees after sorting: " + employees);
        System.out.println("");


        //sorting using comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employee (salary): " + employees);
        System.out.println("");


        System.out.println("employees after sorting with comparator and lambda (salary): " + employees);
 
    }


}
