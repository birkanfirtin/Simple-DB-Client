package simple_demo.db_client;

public class Employee {

    private String firstname;
    private String lastname;
    private int employeeid;
    private double salary;

    public Employee(){
        this.firstname = "";
        this.lastname = "";
        this.employeeid = 0;
        this.salary = 0;
    }

    public Employee(String firstname, String lastname, int employeeid, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.employeeid = employeeid;
        this.salary = salary;
    }

    public Employee(String sercan) {
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public double getSalary() {
        return salary;
    }
}




