package day8revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public List<Employee> read(String fileName) throws FileNotFoundException, IOException{

        List <Employee> employees = new ArrayList<>();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String employee = br.readLine();

        while ((employee = br.readLine()) != null){
            String[] infoVals = employee.split(",");
            Employee emp = new Employee(infoVals[0], infoVals[1], infoVals[2], infoVals[3], infoVals[4], Integer.parseInt(infoVals[5]));

            employees.add(emp);

        }

        br.close();

        return employees;

    }



}
