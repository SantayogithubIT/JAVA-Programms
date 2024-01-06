import java.util.Scanner;

public class JavaStdinandStdout {
    public static void main(String[] args)
     {
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       String mystring= sc.next();

       System.out.println(a);
       System.out.println(b);
       System.out.println(mystring);
       sc.close();
    }
    
    
}
