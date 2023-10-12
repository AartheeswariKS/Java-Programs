package maskingpassword;
import java.util.Scanner;
public class MaskingPassword {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the password:");
      String str=sc.next();
      int len=str.length();
      char pwd[ ]=new char[20];
      int pwdlen=pwd.length;
      int i=0;
      while(len>0)
      {
            pwd[i]=str.charAt(i);
            
            i++;
           
      }
      System.out.println(pwd[i]);  
    }
    
}
