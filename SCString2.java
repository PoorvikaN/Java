import java.lang.*;

public class SCString2
{
    public static void main(String[] args)
    {
          int b=1800110;
  
          String str=String.valueOf(b);

          System.out.println(str.matches("[01]+"));//decimal


          String str1="234AB";
   
          System.out.println(str1.matches("[0-9A-F]+"));//hexadecimal

          String str2="01/12/2005";

          System.out.println(str2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));//dateOfBirth
          
 }
}