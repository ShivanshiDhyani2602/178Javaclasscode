package Kiet;
public class HRDept {
    
    public static void main(String[] args) {
        EmployeeKiet no1 = new EmployeeKiet();
        no1.Emp_id=204;
        no1.Emp_name="ravi";
        //ek.salary = 53000; //not visible in another class as its PRIVATE
        no1.organisation = "KIET";

        no1.employeeDetails();
    }
}