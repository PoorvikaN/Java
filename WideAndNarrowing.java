import java.lang.*;
import java.util.Scanner;

class WideAndNarrowing
{
     public static void main(String arg[])
     {
        
        byte b=5;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;
 
        s=b;//Wide
        i=b;
        l=b;
        l=s;
        f=i;
        b=(byte)s;//narrowing
        i=(byte)f;

        System.out.println(b);
        System.out.println(i);
  }
}