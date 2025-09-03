public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        //dont use try alone
        try{
        System.out.println(100/0);//where we should place exception code yahan pe exception aa skti hai
        }
        catch(Exception e){//IF WE DONT KNOW THE NAME OF THE EXCEPTION THEN WE WILL WRITE ONLY "EXCEPTION"
            //to catch the thrown exception by try 
            System.out.println("catch block executed ... " + e);
        }
        System.out.println(5);
        System.out.println(6);
    }
}
