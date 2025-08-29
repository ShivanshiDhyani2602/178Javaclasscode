import java.nio.channels.Pipe.SourceChannel;

interface institute{
    void register();
    void infrastructure();
    void students();
    void staff();
    
    //ALL THESE ARE ACCEPTABLE IN JAVA 9
    static void concrete(){
        System.out.println("static concrete");
    }
    default void defaultconcrete(){
        privateconcrete();
        System.out.println("default concrete");
    }
    private void privateconcrete(){
        System.out.println("private oncrete");
    }
    }

class ABES implements institute {//child class
            //every method should be public because without mentioning all the methods are set default 
        public void register(){
            System.out.println("KIET IS REGISTERED WITH AKTU");
        }
        public void infrastructure(){
            System.out.println("KIET HAS DIGITAL CLASSROOMS");
        }
        public void students(){
            System.out.println("ADMISSIONS THROUGH COUNSELLING");
        }
        //if we are not overriding any abstract method from the class so we have to make the current class abstract in other to resolve the error
        public void staff(){
            System.out.println("well trained staff");
        }
    }


public class Interface {
    public static void main(String[] args) {
        institute cg;//reference variable
        cg =new ABES();
        cg.infrastructure();
        cg.register();
        cg.students();
        cg.staff();

        //directly calling bcz its static no reference variable needed
        institute.concrete();
        //default
        cg.defaultconcrete();
        //private wala can be called in the same class only
    
    }
}
