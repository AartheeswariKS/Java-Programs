package sumnatnos;
import java.util.Scanner;
public class SumNatnos {

    public static int sumOfNatnos(int n)
    {   
        if(n==1)
            return 1;
        else          
           return n+sumOfNatnos(n-1);
    }

  /*  public static int sumOfNatnos(int n)
    {
        int tot=n*(n+1)/2;
        return tot;
    }*/
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
        int Total=sumOfNatnos(num);
        System.out.println(Total);
        
        
    }
    
}
