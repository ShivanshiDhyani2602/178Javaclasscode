//1.custom exception class
class InvalidEmployeeID extends Exception{
       InvalidEmployeeID(String msg){
        super(msg);
    }
}
//employee class
 class Emp{
    int empid;
    String name;
    //constructor
    Emp(int empid,String name) throws InvalidEmployeeID{
        if(empid<=0)
        System.out.println("ID must be positive");

        this.empid=empid;
        this.name=name;
        System.out.println("Employee created  : "+empid+" "+name );
    }
 }
//Tester c;ass

public class ExceptionUserdefined {
    public static void main(String[] args) {
        try{
            Emp e1= new Emp(101, "Laxmi");
            Emp e2 = new Emp(0, "Divya");
        }
        catch(InvalidEmployeeID e){
            System.out.println("custom exception "+ e);
        }
    }
 
}
