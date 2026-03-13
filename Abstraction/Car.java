//package Abstraction;

public abstract class Car {
    private int a;
    private int b;
    public void sleep(){ 
        System.out.println("Sleeping");
    }
    public static void add(){
        System.out.println("Addition");
    }
    public abstract void run();
}
