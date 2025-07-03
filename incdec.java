import java.lang.*;
import java.util.Scanner;

class incdec
{
     public static void main(String arg[])
     {
        int x=5,y,z;
        float a='A';
        ++a;
        ++x;
        y=x++;
        z=2*x++ + 3 * ++y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
  }
}