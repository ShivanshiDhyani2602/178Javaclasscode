public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;

    EmployeeCopyConstructor(int i,String name){
        Emp_id = i;
        Emp_name = name;
    }

    EmployeeCopyConstructor(EmployeeCopyConstructor emp1){
        Emp_id = emp1.Emp_id;
        Emp_name = emp1.Emp_name;
    }
    void printinfo(){
        System.out.println("Details of the Employee are: " + Emp_id + " and " + Emp_name);
    }

    public static void main(String[] args) {
        EmployeeCopyConstructor employee1 = new EmployeeCopyConstructor(220, "Priya");
        employee1.printinfo();
        EmployeeCopyConstructor copy;
        copy = employee1;
        copy.printinfo();

        copy.Emp_id = 2;
        copy.Emp_name = "Shikha";
        System.out.println("Changed Details : ");
        copy.printinfo();

        EmployeeCopyConstructor copy2 = new EmployeeCopyConstructor(employee1);
        copy2.printinfo();
        copy2.Emp_id = 221;
        copy2.Emp_name = "Ram";
        copy2.printinfo();
    }

}