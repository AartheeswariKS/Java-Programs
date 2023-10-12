package armstrongnum;
import java.util.Scanner;
import static java.lang.Math.pow;

public class ArmstrongNum
{

    public static void main(String args[])
    {
    System.out.println("Enter a number:");    
    int cnt=0;
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int org=num;
    int temp=num;
    int digit=0;
    int sum=0;
     while(num!=0) 
    {
      
        cnt++;
        num/=10;
    }
    while(temp!=0) 
    {
        digit=temp%10;
        sum=(int) (sum+Math.pow(digit, cnt));
        temp/=10;
    }
        
    if(sum==org)
        System.out.println("Armstrong Number");
    else
        System.out.println("Not an Armstrong Number");
    }
}
