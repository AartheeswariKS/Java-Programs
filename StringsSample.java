package strings;
import java.util.Scanner;
public class StringsSample 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        String st[]=str.split("\\s");
        String res[]=new String[st.length];
        for(int i=0;i<st.length;i++)
        {
        int len=st[i].length();
        String firstchar=st[i].substring(0,1).toUpperCase();
        String restchar =st[i].substring(1, len-1);
        String lastchar=Character.toString(st[i].charAt(len-1)).toUpperCase();
        res[i]= firstchar+restchar+lastchar;
        System.out.print(res[i]);
        }
    }    
}

