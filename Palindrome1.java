 package palindrome1;
import java.util.ArrayList;
import java.util.Scanner;
public class Palindrome1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String str=sc.next();
        int n=str.length();
      //  char a[]=new char[n];
       //char b[]=new char[n];
        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(str.charAt(i));
        }
        System.out.println(a);
        for(int i=n-1;i>=0;i--){
            b.add(str.charAt(i));
        }
        System.out.println(b);
       if(a.equals(b))
       {
           System.out.println("Palindrome");
       }
       else
           System.out.println("Not a palindrome");
      
     
       
    }
    
}
