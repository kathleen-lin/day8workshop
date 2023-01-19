package day8revision;

public class Employee implements Comparable<Employee> {

    public String staffName;
    public String fullName;
    public String department;
    public String role;
    public String emailAddress;
    public Integer salary;

    public Employee(String staffName, String fullName, String department, String role, String emailAddress,
            Integer salary) {
        this.staffName = staffName;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }


    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [staffName=" + staffName + ", fullName=" + fullName + ", department=" + department + ", role="
                + role + ", emailAddress=" + emailAddress + ", salary=" + salary + "]";
    }

    

    @Override
    public int compareTo(Employee o) {
        //compare this fullname to the next full name
        return this.getFullName().compareTo(o.getFullName());

    }
    

    

    




}
