import java.lang.*;

public class methods
{
   public static void main (String[] args)
   { 
         
        String str1="p";

        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str1.matches("[a-z][0-9]"));
        System.out.println(str1.matches("a|b"));
        System.out.println(str1.matches("\\w"));
        System.out.println(str1.matches("\\S"));

}
}