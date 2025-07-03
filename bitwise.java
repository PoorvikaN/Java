import java.lang.*;
import java.util.Scanner;

class bitwise
{
     public static void main(String arg[])
     {
          int x=0b1010;
          int y=0b0110;
                    
          int z=x&y;     
          int w=x|y; 
          int u=x^y;
         
      
          System.out.println(z);
          System.out.println(w);
          System.out.println(u);
               
          int c=-0b1010;         
          int d;
          d=c>>1;        
          System.out.println(String.format("%s",Integer.toBinaryString(c)));
          System.out.println(String.format("%s",Integer.toBinaryString(d)));
  }
}