import java.util.*;

public class IncreaseSize
{
   public static void main(String[] args)
     {
       int A[]={8,6,10,9,2,15,7,13,14,11};
       int B[]=new int[2*A.length];
      
        for(int i=0;i<A.length;i++)
        {
            A[i]=B[i];
            int B[i]=null;
            System.out.println(A.length);
        }
        
      }
}