package polymorphism;
class Product{
    // Multiplying two integer values
    public int multiply(int a, int b){
        int prod = a * b;
        return prod;
    }
    // Multiplying three integer values
    public int multiply(int a, int b, int c){
        int prod = a * b * c;
        return prod;
    }
    public double multiply(double a, double b, double c){
        return a * b * c;
    }

}
public class Method_Overloading {
    public static void main(String[] args)
    {
        Product ob = new Product();
        int prod1 = ob.multiply(1, 2);
        System.out.println("Product of the two integer value: " + prod1);
        int prod2 = ob.multiply(1, 2, 3);
        System.out.println("Product of the three integer value: " + prod2);
        double prod3 = ob.multiply(1.5, 2.2, 3);
        System.out.println("Product of the three integer value: " + prod3);

    }
}
