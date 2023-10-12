package lcmandgcd;
import java.util.Scanner;
public class LCMandGCD {
    public int lcm(int num1,int num2)
    {
        int lcm = 1;
        int lim;
        lim=num1*num2;
        for(int i=1;i<=lim;i++)
        {
            if(i%num1==0 && i%num2==0){
                lcm= i;
                break;
            }
        }
        return lcm;
        
    }
    public int gcd(int num1,int num2)
    {
        int lim;
        if (num1>num2)
            lim=num1;
        else
            lim=num2;
         int gcd = 1;
        for(int i=1;i<=lim;i++)
        {
            
            if(num1%i==0 && num2%i==0)
                gcd= i;
      
        }
        return gcd;
        
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int n1=sc.nextInt();
    System.out.println("Enter 2nd number:");
    int n2=sc.nextInt();
    LCMandGCD lg=new LCMandGCD ();
    int LCM=lg.lcm(n1, n2);
    int GCD=lg.gcd(n1, n2);
    System.out.println("LCM is:"+LCM);
    System.out.println("GCD is:"+GCD);
    }
    

}
