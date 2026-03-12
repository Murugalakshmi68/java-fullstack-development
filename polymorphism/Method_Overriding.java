package polymorphism;
class Parent {
    void Print() { System.out.println("parent class"); }
}
class Father extends Parent {
    void Print() { System.out.println("Father class"); }
}
class Mother extends Parent {
    void Print() { System.out.println("Mother class"); }
}
public class Method_Overriding {
    public static void main(String[] args){
        Parent n1=new Father();
        n1.Print();
        Parent n2 = new Mother();
        n2.Print();
        Parent n3=new Parent();
        n3.Print();
    }
}
