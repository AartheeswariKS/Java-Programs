package anagram1;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram1 {
    public static void main(String[] args) {
       System.out.println("Enter the Strings:");    
       Scanner sc=new Scanner(System.in);
       String str1=sc.next();
       String str2=sc.next();
       if(str1.length()==str2.length())
       {
           char arr1[]=str1.toLowerCase().toCharArray();
           char arr2[]=str2.toLowerCase().toCharArray();
           Arrays.sort(arr1);
           Arrays.sort(arr2);
           if(Arrays.equals(arr1,arr2))
           {
               System.out.println("Anagram");
           }
           else
               System.out.println("Not Anagram");
       }
       else
           System.out.println("Not Anagram");
       
       
       
    }
    
}
