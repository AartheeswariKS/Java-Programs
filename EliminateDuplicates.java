package eliminateduplicates;
import java.util.Scanner;
public class EliminateDuplicates 
{
    public static void main(String[] args)
    {
        System.out.println("Enter size of the Array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements before eliminating the Duplicates:");
        for(int a=0;a<n;a++)
        {
            System.out.println(arr[a]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=0;k<n-1;k++)
                    { 
                        arr[k]=arr[k+1];  
                    }
                    n--;
                    j--;
                }
                
            }
        }
        System.out.println("Array Elements after eliminating Duplicates:");
         for(int a=0;a<n;a++)
         {
             System.out.println(arr[a]);
         }
    }
   
}

