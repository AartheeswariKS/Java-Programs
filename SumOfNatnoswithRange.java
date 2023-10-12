package sumofnatnoswithrange;
import java.util.Scanner;
public class SumOfNatnoswithRange {
     public static int sumNatnos(int start ,int end)
     {
         if(start==end)
             return start;
         else 
             return start+sumNatnos(start+1,end);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int startnum=sc.nextInt();
        int endnum=sc.nextInt();
        int tot=sumNatnos(startnum,endnum);
        System.out.print("The sum is:"+tot);
    }  
}
