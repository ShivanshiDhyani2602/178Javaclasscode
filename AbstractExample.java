import java.nio.channels.Pipe.SourceChannel;

abstract class College{
    abstract void register();
    abstract void infrastructure();
    abstract void students();
    abstract void staff();
    //concrete method
    void medicalFac(){
        System.out.println("Medical faculties are optional.");
    }}
    class kiett extends College{//child class
        @Override

        void register(){
            System.out.println("KIET IS REGISTERED WITH AKTU");
        }
        void infrastructure(){
            System.out.println("KIET HAS DIGITAL CLASSROOMS");
        }
        void students(){
            System.out.println("ADMISSIONS THROUGH COUNSELLING");
        }
        //if we are not overriding any abstract method from the class so we have to make the current class abstract in other to resolve the error
        void staff(){
            System.out.println("well trained staff");
        }
    }



public class AbstractExample {
    public static void main(String[] args) {
        College cg;//reference variable
        cg =new kiett();
        cg.infrastructure();
        cg.register();
        cg.students();
        cg.staff();
        cg.medicalFac();
    }
}
