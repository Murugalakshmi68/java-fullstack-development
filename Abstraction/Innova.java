//import Abstraction.Car.*;
public class Innova extends Car {
    @Override
    public void run(){
        System.out.println("Fast");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping called");
    }
    public static void main(String[] args) {
        Innova obj=new Innova();
        Maruthi obj1=new Maruthi();
        add();
        obj.sleep();
        obj.run();
        obj1.sleep();
        obj1.run();
    }
}
