import java.util.Scanner;

public class strings {
    public static void main(String[] args){
	    
	    Scanner scan =new Scanner(System.in);
	    
	    System.out.println("Enter the numbers");
	 int a=scan.nextInt();
	 int b=scan.nextInt();
	 int c=a+b;
     System.out.println("your output is:"+c);
     
     float f=scan.nextFloat();
     float d=scan.nextFloat();
     System.out.println("added value is:"+(f+d));
     //nextDouble
     //string -next()
     String ff=scan.next();
     System.out.println(ff);
    scan.nextLine(); //this is important
     String str= scan.nextLine();
     System.out.println(str);
    scan.close();
	}
}

