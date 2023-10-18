package secondlargest.smallestinarr;
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestSmallestInArr 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array to store marks of students:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the mark of the students:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("Marks of the students are:");
         for(int i=0;i<n;i++)
         {
             System.out.println(arr[i]);
         }
         
        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];  
            if(arr[i]<min)
                min=arr[i];
        }
        int smax=0;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>min && arr[i]<smin)
                smin=arr[i];
            if(arr[i]>min && arr[i]<max)
                smax=arr[i];
                
        }
        System.out.println("Maximum score:"+max);
        System.out.println("Minimum score:"+min);
        System.out.println("Second Maximum score:"+smax);
        System.out.println("Second Minimum score:"+smin);

        
    }
    
}
