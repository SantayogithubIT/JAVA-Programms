import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args)
     {
       double r1,r2;
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of b");
        int b=sc.nextInt();


        System.out.println("Enter the value of c");
         int c=sc.nextInt();
       
         r1=((-b + Math.sqrt(b*b-4*a*c))/(2*a));
        r2=((-b - Math.sqrt(b*b-4*a*c))/(2*a));
        System.out.println("The first Root Will be  " +r1);
        System.out.println("The first Root Will be  " +r2);

        sc.close();



    }
    
}
