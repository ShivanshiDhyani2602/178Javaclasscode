package Kiet;

public class EmployeeKiet {
    public String Emp_name;
    private int salary;
    protected int Emp_id;
    String organisation; 


    public void employeeDetails(){
        System.out.println("Deatils of kiet employees are : " + Emp_id +" " +Emp_name + " " + salary + " " +organisation);
    }

      
    public static void main(String[] args) {
        EmployeeKiet no1 =  new EmployeeKiet();
        no1.Emp_id = 1002;
        no1.Emp_name = "Divya";
        no1.salary = 550000;
        no1.organisation = "KIET";

        no1.employeeDetails();
    }

}