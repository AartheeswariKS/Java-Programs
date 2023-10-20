package count_palindrome_substrings;
import java.util.Scanner;
public class Count_Palindrome_Substrings {
    public static int palindromeSubstringCount(String s)
    {
        int count=0;
        String temp  ;
        StringBuffer str  ;
        System.out.println("Palindrome substrings are:");
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+2;j<=s.length();j++)
            {
                    temp=s.substring(i, j);
                    str=new StringBuffer(temp);
                    str.reverse();
                    if(str.toString().equals(temp))
                    {
                        count++;    
                        System.out.println(temp);
                    }
                    
                
                
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        int count=palindromeSubstringCount(str);
        System.out.println("Number of Palindrome substrings are:"+count);
       
    }
    
}
