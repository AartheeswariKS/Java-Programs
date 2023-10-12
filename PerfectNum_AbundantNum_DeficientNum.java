package perfectnum_abundantnum_deficientnum;
import java.util.Scanner;
public class PerfectNum_AbundantNum_DeficientNum
{
     private static boolean isPerfectNum(int num)
        {
            int sum=0;
            for(int i=1;i<=num/2;i++)
            {
                if(num%i==0)
                {
                sum=sum+i;
                }
            }
            if(sum==num)
              return true;
            else
              return false;
                
        }
        private static boolean isAbundantNum(int num)
        {
             int sum=0;
            for(int i=1;i<=num/2;i++)
            {
                if(num%i==0)
                {
                sum=sum+i;
                }
            }
            if(sum>num)
              return true;
            else
              return false;
        }
        private static boolean isDeficientNum(int num)
        {
             int sum=0;
            for(int i=1;i<=num/2;i++)
            {
                if(num%i==0)
                {
                sum=sum+i;
                }
            }
            if(sum<num)
              return true;
            else
              return false;
        } 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfectNum(n))
            System.out.println("It is a Perfect number");
        else if(isAbundantNum(n))
            System.out.println("It is an Abundant number");
        else if(isDeficientNum(n))
            System.out.println("It is a Deficient Number");
        else
            System.out.println("It is a number");
            
        
       
    }
    
}
