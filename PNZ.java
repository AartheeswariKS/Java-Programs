import java.util.Scanner;
public class PNZ
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int pos=0;
        int neg=0;
        int zeros=0;
        String choice = null;
        do
        {
            System.out.println("Enter a number:");
            n=sc.nextInt();
            if(n>0)
              pos++;
            else if(n<0)
              neg++;
            else
              zeros++;
            System.out.println("Do you continue?Y/N");
            choice=sc.next();
        }
        while("Y".equals(choice));
        System.out.println("No of positive numbers: "+pos);
        System.out.println("No of negative numbers: "+neg);
        System.out.println("No of zeros: "+zeros);
    }  
    
}