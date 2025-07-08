import java.util.*;

public class FindArmstrong
{ 
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
          
         System.out.println("Enter a Number");
         int n=sc.nextInt();

         int i,r;
         int m=n;
         int sum=0;
         while(n>0)
         {   
            r=n%10;   
            n=n/10; 
            sum=sum+r*r*r;            
         }   
            System.out.println("Sum is "+sum); 
           if(m==sum)
            System.out.println("Its a Armstrong Number");
           else
            System.out.println("Its not a Armstrong Number");     
     }
}