package day8revision;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMINATOR = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffName, fullName, department, role, emailAddress, salary";
    public List<Employee> employees = null;

    public List<Employee> generateEmployees(){
        employees = new ArrayList<Employee>();

        //create some employees
        Employee emp1 = new Employee("zanxin", "yang zanxin", "zx", "female lead", "yzx@zx.com", 8500);
        Employee emp2 = new Employee("baiyin", "gu baiyin", "zx", "male lead", "gby@zx.com", 8000);
        Employee emp3 = new Employee("rufei", "he yan", "njx", "female lead", "hy@njx.com", 10500);
        Employee emp4 = new Employee("huaijin", "xiao jue", "njx", "male lead", "xhj@njx.com", 10000);

        //add to list employees
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;

    }

    public void writeCSV(List<Employee> employees, String fileName) throws IOException{
        
        FileWriter fw = new FileWriter(fileName);
        //Write FILE_HEADER to CSV
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);


        for (Employee e : employees){
            fw.append(e.getStaffName());
            fw.append(COMMA_DELIMINATOR);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMINATOR);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMINATOR);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMINATOR);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMINATOR);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPERATOR);
        }
        fw.flush();
        fw.close();
    }


}
