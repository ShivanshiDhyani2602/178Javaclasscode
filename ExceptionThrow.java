class example{
    int salary;
    example(int salary) throws IllegalArgumentException{
        if(salary<=0){
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary=salary;
        System.out.println(salary);
    }
}


public class ExceptionThrow {
    public static void main(String[] args) {
        // int age=15;
        // if(age<18){
        //     throw new ArithmeticException("Not eligible to vote");
        // }
        // System.out.println("You can vote");
        
        try{
            example e = new example(0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
