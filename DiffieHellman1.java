package diffiehellman1;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class DiffieHellman1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prime number q:");
        int q=sc.nextInt();
        
        System.out.println("Enter a primitive root of q:");
        int a=sc.nextInt();

        System.out.println("Enter Sender's private Key x1 less than q:");
        int x1=sc.nextInt();
        int y1=(int) (pow(a,x1)%q);
        System.out.println("Sender's Private Key is:"+x1 );
        System.out.println("Sender's Public Key is:"+y1 );
        
        System.out.println("Enter Reciever's private Key x2 less than q:");
        int x2=sc.nextInt();
        int y2=(int) (pow(a,x2)%q);
        System.out.println("Reciever's Private Key is:"+x2 );
        System.out.println("Reciever's Public Key is:"+y2);
                
        int k1=(int) (pow(y2,x1)%q);
        int k2=(int)(pow(y1,x2)%q);
         
        System.out.println("Secret Key at Sender's side is :"+k1);
        System.out.println("Secret key at Reciever's side is :"+k2);
        
        if(k1==k2)
            System.out.println("The transmission is secure");
        else
            System.out.println("The transmission is less secure");
        
    }
    
}
