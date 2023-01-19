package day8revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public List<Employee> read(String fileName) throws FileNotFoundException, IOException{

        List<String> employeeInfo = new ArrayList<String>();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String employee = "";

        while ((employee = br.readLine()) != null){
           employeeInfo.add(employee);
        }

        br.close();

        //System.out.println(employeeInfo);

        //from index 1 onwards (delete header), split up each line according to commas and store them into employees with setters

        List <Employee> employees = new ArrayList<>();

        for (int i =1 ; i < employeeInfo.size(); i++){
            String information = employeeInfo.get(i);
            String[] infoVals = information.split(",");
            Employee emp = new Employee(infoVals[0], infoVals[1], infoVals[2], infoVals[3], infoVals[4], Integer.parseInt(infoVals[5]));

            employees.add(emp);
        }

        return employees;

    }



}
