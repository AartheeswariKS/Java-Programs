package noof_arms.pldrnm_numinarr;
import java.util.Scanner;
public class NoOf_ArmsPldrnm_NumInArr {
    public static boolean isPalindrome(int num)
    {
        
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
         return true;
       else
         return false;
        
    }
        public static boolean isAmstrongNum(int num)
    {
        
        int count=0;
        int digit;
        int tot=0;
        int temp=num;
        int org=num;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        while(temp>0)
        {
           digit=temp%10;
           tot=(int) (tot+Math.pow(digit,count));
            temp=temp/10;
        }
       if(tot==org)
         return true;
       else
         return false;       
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of the Array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter Number of Elements in the Array:");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("Elements of the Array are:");
      for(int i=0;i<n;i++)
      {
          System.out.println(arr[i]);
      }
       int armstrongnums=0;
       int palindromenums=0;
      for(int i=0;i<n;i++)
      {
          
          if(isAmstrongNum(arr[i]))
          {
              armstrongnums++;
          }
          if(isPalindrome(arr[i]))
          {
              palindromenums++;
          }

          
      }
      System.out.println("Number of Armstrong Numbers in the Array are:"+armstrongnums);
      System.out.println("Number of Palindrome Numbers in the Array are:"+palindromenums);
 
    }
    
}
