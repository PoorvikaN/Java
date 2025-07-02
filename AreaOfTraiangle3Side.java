import java.lang.*;
import java.util.Scanner;

class AreaOfTraiangle3Side
{
   public static void main(String arg[])
     {
         int a,b,c;
         float s;
         double area;
         System.out.println("Enter the values a,b, and c ");

         Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();

         s=(a+b+c)/2f;
         
         area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
 
         System.out.println("Area of Traiangle is "+area);
  }
}
    