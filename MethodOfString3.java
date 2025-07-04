import java.lang.*;

public class MethodOfString3
{
    public static void main(String[] args)
     {
        String str1="JAVA";
        String str2="java";
        String str3="python";

        
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str1));
        System.out.println(str1.contains("AY"));
        System.out.println(str1.concat(str2));
        
        
    }
    
}