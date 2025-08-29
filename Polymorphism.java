class EmployeePoly{
    String emp_name;

    void deets(){
        System.out.println("NAME "+ emp_name);
    }
    void deets(int salary){
        System.out.println("SALARY "+salary);
    }
    void deets(String company){//Aise method jisme firse ek hi parameter ho but different data types to wo valid hog
        System.out.println("INSTITUTE "+company);
    }
      void deets(int salary,String company){
        System.out.println("SALARY and company "+salary+" "+company);
    }
      void deets(String company,int salary){
        System.out.println("SALARY and company "+salary+" "+company);//PARAMETER KA ORDER BHI CHANGE KR SKTE HAI
    }
}
class Faculty extends EmployeePoly{
    //METHODE OVERRIDING
    void deets(){
        super.deets();//yahan aate hi super class ko call krna hai ...agar sirf f.deets se kraya to sirf child class ka hua isse parent class ka bhi hoga
        System.out.println("Welcome faculties.");//same method,different work
    }
}

public class Polymorphism {
   
    public static void main(String[] args) {
        // EmployeePoly emp=new EmployeePoly();
        // emp.emp_name="Rohit";
        // emp.deets();
        // emp.deets(640000);
        // emp.deets("KIET");
        //for overriding

        Faculty f= new Faculty();
        f.emp_name="Rahul";
        f.deets();
    }
}
