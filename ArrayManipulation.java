package arraymanipulation;
import java.util.Scanner;
public class ArrayManipulation
{
    int product(int arp[])
    {
        
       int product=1;
       for(int i=0;i<arp.length;i++)
       {
            product=product*arp[i];
       }
       return product;
    }
    int result(int prod,int a[])
    {
        if(prod==0)
            return 0;
        else if(prod%2==0)
       { 
           int sum=0;
           for(int i=0;i<a.length;i++)
           {
                sum=sum+a[i];
           }
           return sum;
       }
        else
        {
            return 1;
        }
        
      
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Array size:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter Elements of Array:");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("Array Elements are:");
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(arr[i]);
       }
       ArrayManipulation am=new ArrayManipulation();
       int product=am.product(arr);
       System.out.println("Product is :"+product);
       System.out.println("Result is:"+am.result(product, arr));
    }
    
}
