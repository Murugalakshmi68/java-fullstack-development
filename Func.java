public class Func {
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static void main(String args[]){
        add(4,5);
        int c=sub(6,2);
        System.out.println(c);
        System.out.println(sub(9,3));
    }
}
