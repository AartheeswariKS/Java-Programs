package strongnumber;
import java.util.Scanner;
public class StrongNumber {

    public static int fact(int n)
    {
        if (n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);      
     System.out.println("Enter the number:");
     int num=sc.nextInt();
     int sum=0;
     int digit;
     int temp=num;
     while(temp!=0)
     {
         digit=temp%10;
         sum=sum+fact(digit);
         temp/=10;
     }
     if(sum==num)
     {
         System.out.println("It is a Strong Number");
         
     }
     else
         System.out.println("It is not a Strong Number");
    }
    
} 
