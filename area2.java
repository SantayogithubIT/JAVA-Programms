import java.util.Scanner;


public class area2 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        float S;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 sides");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S=(a+b+c)/2f;
        area= Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("The area is " +area);
        
        sc.close();
    }
    
}
