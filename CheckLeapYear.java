import java.util.*;

public class CheckLeapYear {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int year;
       System.out.println("Enter a number");
     year=scan.nextInt();
      
     if(year%4==0)
     {
         if(year%100==0)
         {
             if(year%400==0)
             {
                 System.out.println("It is a LEAP YEAR");
             }
             else
                 System.out.println("Not a LEAP YEAR");
         }
         else
         {
             System.out.println("Not a LEAP YEAR");
         }

     }
     else
     {
         System.out.println("Not a LEAP YEAR");
     }
    }
}