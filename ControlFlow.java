public class ControlFlow {
    public static void main(String args[]){
        // if
        int age =20;
        if(age>=18){
        System.out.println("Eligible for vote");
        }
        if(age<5)
        System.out.println("Don't go to school");

        //if - else
        age= 17;
        if(age>=18){
        System.out.println("Eligible for vote");
        }
        else{
        System.out.println("Not Eligible"); 
        }

        //ladder if
        int a = 10,b=25,c=15;
        System.out.println("Find greatest number ");
        if(a>b)  System.out.println("a is big");
        else if(b>c) System.out.println("b is big");
        else System.out.println("c is big");

        // nested if
        int x= 5;
        System.out.println("find positive or negative");
        if(x>0){
            if(x==0){
                System.out.println("The Number is 0");
            }
            else{
                System.out.println("The number is positive");
            }
        }
        else{
            System.out.println("The number is negative");
        }


        // for loop
        System.out.println("Even Numbers");
        for(int i=2;i<=10;i=i+2)
        System.out.println(i);

       /*it runs infinity time
        for(;;) System.out.println("hi");
        for(int i = 1;;) System,out,println("hi"); 
        int i = 1; 
        for(;i<=2;) System.out.println("hi");
        System.out.println(i);  
        int i = 1; 
        for(;i<=2;i++) System.out.println("hi");
        System.out.println(i); // ans : 3 */

        for(int i=0;i<5;i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++) System.out.print("* ");
            System.out.println();
        }

        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++) System.out.print(j+ " ");
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++) System.out.print(i+ " ");
            System.out.println();
        }

        int count=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++) System.out.print(count++ + " ");
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            int count1 = 5;
            for(int j=1;j<=4;j++){
                System.out.print((count1++)+ " ");
            }
            System.out.println();
        }

        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

       /* for(int i = 1;i<=5;i++){
            for(int s=1;s<=(5-i);s++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(); */ 

        for(int i = 1;i<=5;i++){
            for(int s=1;s<=5;s++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1;i<=5;i++){
            for(int s=1;s<=(5-i);s++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i<=5;i++){
            for(int s=4;s>=i;s--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //while loop
         int w=110;
         while(w>10){
            System.out.println(w);
            w++;
            if(w==115){
               break;
            }
        }
        System.out.println(w);

        int num = 121;
        int sum = 0;
        while(num != 0){
            int rem = num %10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of digits :"+ sum);

    }
}

 
