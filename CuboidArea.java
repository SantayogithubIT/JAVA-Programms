import java.util.Scanner;

public class CuboidArea {
    public static void main(String[] args) {
        int b,h,l;
        int area, volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breadth, height, length");
        b=sc.nextInt();
        h=sc.nextInt();
        l=sc.nextInt();
      
        area=2*(l*b+b*h+h*l);
        volume=(l*h*b);

        System.out.println("The area of a cuboid is  " +area);
        System.out.println("The volume of a cuboid is  " +volume);

        sc.close();



    }
    
}
