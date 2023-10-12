package sumdigits;
import java.util.Scanner;
public class SumDigits
{
    public int sumOfDigits(int num)
    {
        int total=0;
        int digits=0;
        while(num>0)
        {
        digits=num%10;
        total=total+digits;
        num/=10;
        }
        return total;
        
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       SumDigits s=new SumDigits();
       int sum=s.sumOfDigits(num);
       System.out.println("The sum of digits of "+num+" is:"+sum);
    }
    
}
