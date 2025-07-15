import java.util.*;

public class MethodOverload2 {

static int sum(int ...A)
  {
      int s=0;
      for (int i=0;i<A.length;i++)
      s+=A[i];
        
        return s;
    }
    
    static double sum(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
        
    }
}