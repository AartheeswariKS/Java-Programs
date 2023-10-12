package sunnynumber;
import static java.lang.Math.*;
import java.util.Scanner;
public class SunnyNumber {
    private static boolean isPerfectSquare(int n)
    {
        if(ceil(sqrt(n))==floor(sqrt(n)))
            return true;
        else
            return false;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x=num+1;
        if(isPerfectSquare(x))
           System.out.println("It is a Sunny number");
        else
            System.out.println("It is not a Sunny number");
    }
    
}
