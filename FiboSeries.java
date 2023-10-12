package fiboseries;
import java.util.Scanner;
public class FiboSeries 
{
    public static int fibo(int n)
    {
        if(n<=1)
            return n;
        else
           return fibo(n-1)+fibo(n-2); 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int lim=sc.nextInt();
        System.out.println("Fibonacci series is:");
        for(int i=0;i<lim;i++)
        {
            System.out.println(fibo(i));
        }
        
    }
    
}
