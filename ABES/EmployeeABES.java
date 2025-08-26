package ABES;
import Kiet.*;

//import Kiet.EmployeeKiet;

// public class EmployeeABES {
//   
//     public static void main(String[] args) {
//         EmployeeKiet ek = new EmployeeKiet();
//         ek.Emp_name = "Divya";
//         // ek.Emp_id = 101; //protected
//         // ek.salary = 44500; //private 
//         // ek.organisation = "KIET"; //default
        
//         ek.employeeDetails();
//     }
// }

public class EmployeeABES extends EmployeeKiet{

    public static void main(String[] args) {

    //  EmployeeKiet ek = new EmployeeKiet();  this line is not needed since we already have extended empKiet
    EmployeeABES ae = new EmployeeABES();
    ae.Emp_name = "Rishi";
    ae.Emp_id = 102;  // yaha pe protected acess ho paya
    // ae.salary = 22000; // not accessible
    // ae.organisation = "KIET";
    ae.employeeDetails();


    //instance variable = puri class me visible ho
    // local variable= kisi method ke andar
    // static int m = 410; == static variable

    }
} 
