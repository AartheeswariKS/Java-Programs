package perfectsquare;
import static java.lang.Math.*;
import java.util.Scanner;
public class PerfectSquare 
{
         private static boolean isPerfectSquare(int n)
        {
            if(floor(sqrt(n))==ceil(sqrt(n)))
                return true;
            else
                return false;
        }
    public static void main(String[] args) 
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPerfectSquare(num))
            System.out.println("It is a Perfect Square");
       else
            System.out.println("It is not a Perfect Square");
    }
    
}
