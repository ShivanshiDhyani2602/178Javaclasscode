public class methodCode{ //class

    int id;
    String name;

    // public void displayMethod(){
    //     System.out.println("Hello from display method");
    //     System.out.println("Details are:" + id + " " + name);
    // }
    
    methodCode(int id,String name){//parametrised constructer
        System.out.println("Details are:" + id + " " + name);
        this.id = id;
        this.name = name;
    }
        public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("Details are:" + id + " " + name);
    }
    


    public static void main(String[] args) {
        // methodCode m1=new methodCode();//object
        // m1.id=101;
        // m1.name = "Siddhi";
        // m1.displayMethod();


        // methodCode m2=new methodCode();
        // m2.id=112;
        // m2.name = "Shreya";
        // m2.displayMethod();

        methodCode m3 = new methodCode(75, "siya");
        m3.displayMethod();
        
    }
}