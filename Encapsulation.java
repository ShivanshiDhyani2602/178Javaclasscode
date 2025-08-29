import java.util.Scanner;
class employeeEncapsulation {
    private int accountbalance; //data hiding...will be visible withi the same class so to get its access we need setter getter methods
    private int upipin=998899;

    public void setbalance(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter UPI pin");
        int pin=sc.nextInt();

        if(pin==upipin){
            accountbalance=balance;
            System.out.println("Congratulation salary is credited");
        }
        else{
            System.out.println("Salary not credited");
        }
    }

    public int getbalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To know the balance please enter UPI pin");
        int pin=sc.nextInt();
        if(pin==upipin){
            System.out.println("Available balance is:" + accountbalance);
        }
        else{
            System.out.println("WRONG PIN");//wrong pin so value was not set
        }
        return -1;
    }

}
public class Encapsulation{
public static void main(String[] args){
    employeeEncapsulation ee=new employeeEncapsulation();
    ee.setbalance(9000000);
    ee.getbalance();
}
}