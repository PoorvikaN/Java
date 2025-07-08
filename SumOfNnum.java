import java.util.*;

public class SumOfNnum
{ 
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
          
         System.out.println("Enter a Number");
         int n=sc.nextInt();
         int i,sum=0;
         for (i=1; i<=n; i++)
         {
            sum=sum+i;       
         }
         System.out.println("Sum of "+n+" Number is "+sum);
     }
}