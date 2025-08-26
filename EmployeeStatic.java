public class EmployeeStatic {
    int emp_id;
    static String org; //we can access the static variable directly from the class
    // or
    // static{
    //     org = "kiet";
    // }

    void details(){
        System.out.println("ID : " + emp_id + "  org : " + org);
    }
    static void staticMethod(){
        System.out.println("static method");
    }
    
    public static void main(String[] args) {
        EmployeeStatic.org = "KIET"; //imp
        EmployeeStatic emp = new EmployeeStatic();
        emp.emp_id = 101;
        //emp.org = "KIET";
        emp.details();
        
    EmployeeStatic emp2 = new EmployeeStatic();
    emp2.emp_id = 203;
    //emp.org = "KIET";
    emp2.details();
    staticMethod();
    }
    
} 

