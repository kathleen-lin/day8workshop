package day8revision;

import java.io.IOException;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException{
        
        
        CSVWriter csvw = new CSVWriter();

        List<Employee> employee = csvw.generateEmployees();
        csvw.writeCSV(employee, "./csv/employees_empty.txt");
    
        
        CSVReader csvr = new CSVReader();
        List<Employee> employees = csvr.read("./csv/employeesrecord.txt"); 
        System.out.println(employees);
        

    }
}
