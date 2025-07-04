import java.lang.*;

public class MethodOfString {
    
    public static void main(String[] args) {
        String str=new String("  netbeans  ");
        int len=str.length();
         
        System.out.println(len);//give length of string
        
        String str2=str.toUpperCase();//print string in uppercase
        System.out.println(str2);
        
        String str3=str.toLowerCase();//print string in lowercase
        System.out.println(str3);
        
        String str4=str.trim();//print by removing the space
        System.out.println(str4);
        
        String str5=str.substring(3,6);//starting and ending
        System.out.println(str5);
        
        String str6=str.replace('e','M');//repalcing an element
        System.out.println(str6+ "  "+str);
        
        String str2="WWW.google.com";
        
        System.out.println(str1.startsWith("google",4));
        System.out.println(str1.endsWith("com"));
        System.out.println(str1.charAt(6));
        System.out.println(str1.indexOf('.',4));
      
        
    }
    
}
