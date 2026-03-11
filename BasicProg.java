import java.util.Scanner;

public class BasicProg{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Factorial
        System.out.print("Enter number for factorial: ");
        int n = sc.nextInt();
        factorial(n);

        // 2. Fibonacci
        System.out.print("\nEnter limit for Fibonacci: ");
        int f = sc.nextInt();
        fibonacci(f);

        // 3. Prime Number
        System.out.print("\nEnter number to check prime: ");
        int p = sc.nextInt();
        isPrime(p);

        // 4. Swap using 3rd variable
        swapWithThird(10, 20);

        // 5. Swap without 3rd variable
        swapWithoutThird(10, 20);

        // 6. Leap Year
        System.out.print("\nEnter year: ");
        int year = sc.nextInt();
        leapYear(year);

        // 8. Palindrome
        System.out.print("\nEnter number to check palindrome: ");
        int pal = sc.nextInt();
        palindrome(pal);

        // 9. Reverse Number
        System.out.print("\nEnter number to reverse: ");
        int rev = sc.nextInt();
        reverseNumber(rev);

        // 10. Sum of Digits
        System.out.print("\nEnter number to find sum of digits: ");
        int sum = sc.nextInt();
        sumOfDigits(sum);

        // 11. Armstrong
        System.out.print("\nEnter number to check Armstrong: ");
        int arm = sc.nextInt();
        armstrong(arm);

        sc.close();
    }

    // 1️⃣ Factorial
    static void factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }

    // 2️⃣ Fibonacci
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 3️⃣ Prime Number
    static void isPrime(int n) {
        boolean prime = true;

        if(n <= 1) prime = false;

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    // 4️⃣ Swap using third variable
    static void swapWithThird(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nSwap with third variable: " + a + " " + b);
    }

    // 5️⃣ Swap without third variable (Arithmetic)
    static void swapWithoutThird(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap without third variable: " + a + " " + b);
    }

    // 6️⃣ Leap Year
    static void leapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    // 8️⃣ Palindrome
    static void palindrome(int n) {
        int original = n, reverse = 0;

        while(n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        if(original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // 9️⃣ Reverse Number
    static void reverseNumber(int n) {
        int reverse = 0;

        while(n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }

    // 🔟 Sum of Digits
    static void sumOfDigits(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    // 1️⃣1️⃣ Armstrong Number
    static void armstrong(int n) {
        int original = n;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if(sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
