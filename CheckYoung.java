import java.util.*;

public class CheckYoung {
    public static void main(String[] args) {
         
        int age;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your age");
        age=sc.nextInt();
        
if(age>14 && age<=55)
{
    System.out.println("you are Young");
}
else
{
    System.out.println("you are older");
}
    }
}
