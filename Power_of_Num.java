package power_of_num;
import java.util.Scanner;
public class Power_of_Num 
{
    private static int pow(int base,int exp)
    {     
        int res = 1;
        if(exp==0)
            return 1;
        else
        {
        while(exp!=0){
            res=res*base;
            exp--;
           
        }
         return res;
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=sc.nextInt();
        System.out.println("Enter the exponent:");
        int exp=sc.nextInt();
        int result=pow(base,exp);
        System.out.println("The result is:"+result);
    }   
}
