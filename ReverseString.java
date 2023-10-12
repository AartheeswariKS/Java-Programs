package reversestring;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String;");
      String str=sc.next();
      int strlen=str.length();
      char rev=0;
      System.out.println("Reversed String:");
      for(int i=strlen-1;i>0;i--)
      {
           rev=str.charAt(i);
           System.out.print(rev);
      }
      
        
    }
    
}
