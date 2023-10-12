package primenumber;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(long n)
    {
         int flag=0;
        for(int i=2;i<=sqrt(n);i++)
        {
           if(n%i==0)
           {
                flag=1;
           }
        }
        if (flag==0)
               return true;
        else 
              return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        long num=sc.nextLong();
        if(isPrime(num))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        
    }
    
}
