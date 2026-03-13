public class ThrowExample {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}