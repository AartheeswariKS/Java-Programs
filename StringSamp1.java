package stringsamp1;
import java.util.Scanner;
public class StringSamp1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input:");
        String str=sc.next();
        StringBuilder output =new StringBuilder();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char c=str.charAt(i);
            if(Character.isLetter(c))
            {
                output.append(c);
            }
            else if(Character.isDigit(c))
            {
                int count=Character.getNumericValue(c);
                char prevchar=str.charAt(i - 1);
                for(int j=1;j<count;j++)
                {
                    output.append(prevchar);
                    
                }
            }
        }
        System.out.println(output.toString());
    }
    
}
