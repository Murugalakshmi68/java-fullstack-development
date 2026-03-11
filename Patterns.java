public class Patterns {
    public static void main(String args[]){
        System.out.println("squre hollow pattern");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5) 
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Number Triangular pattern");
        for(int i=1;i<=4;i++){
            for(int s=1;s<=4-i;s++) System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
        System.out.println("Number Increasing pramid");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Reverse Number Increasing pramid");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Number changing pramid");
        int c1=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((c1++)+" ");
            }
            System.out.println();
        }
        System.out.println("Zero-One Triangle");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
        System.out.println("Palindrome Triangular");
        for(int i=1;i<=4;i++){
            for(int s=1;s<=4-i;s++) System.out.print("  ");
            for(int k=i;k>=1;k--) System.out.print(k+" ");
            for(int j=2;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
        System.out.println("Rhombus Pattern");
        for(int i=1;i<=5;i++){
            for(int s=1;s<=i-1;s++) System.out.print("  ");
            for(int j=1;j<=4;j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println("Pramid Pattern");
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println("Diamond Patern");
        for(int i=1;i<=4;i++){
            for(int s=1;s<=4-i;s++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=4;i++){
            for(int s=1;s<=i-1;s++) System.out.print(" ");
            for(int j=i;j<=4;j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println("Butterfly Pattern");
        //upper half
        for(int i=1;i<=5;i++){
            //left half
            for(int j=1;j<=i;j++) System.out.print("* ");
            //spaces
            for(int s=1;s<=2*(5-i);s++) System.out.print("  ");
            //right half
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        //lower half
        for(int i=4;i>=1;i--) {
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int s=1;s<=2*(5-i);s++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println("Reverse number triangle pattern");
        for(int i=1;i<=4;i++){
            int x=i;
            for(int s=1;s<=i-1;s++) System.out.print(" ");
            for(int j=1;j<=4-i+1;j++) System.out.print(x++ +" ");
            System.out.println();
        }
        System.out.println("Mirror image triangle pattern");
        for(int i=1;i<=4;i++){
            int x=i;
            for(int s=1;s<=i-1;s++) System.out.print(" ");
            for(int j=1;j<=4-i+1;j++) System.out.print(x++ +" ");
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            int x=i;
            for(int s=1;s<=i-1;s++) System.out.print(" ");
            for(int j=1;j<=4-i+1;j++) System.out.print(x++ +" ");
            System.out.println();
        }
        System.out.println("Hollow Triangle");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==5 || j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Hollow Pramid");
        for(int i=1;i<=5;i++){
            //for(int s=1;s<=5-i;s++) System.out.print("  ");
            for(int j=1;j<=2*5-1;j++){
                if(j==5-i+1 || j==5+i-1 || i==5) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        


    }
}
