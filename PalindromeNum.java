
package palindromenum;

import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {
         System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit;
        int rev=0;
        int temp=num;       
        while(temp>0)
        {
           digit=temp%10;
           rev=(rev*10)+digit;
            temp=temp/10;
        }
       if(rev==num)
       {
           System.out.println("Palindrome");
       }
       else
           System.out.println("Not a Palindrome");
    }
    
}
