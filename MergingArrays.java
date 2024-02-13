package mergingarrays;
import java.util.Scanner;
public class MergingArrays 
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of 1st Array:");
         int n1=sc.nextInt();
         System.out.println("Enter sizeof 2nd Array:");
         int n2=sc.nextInt();
         int s=n1+n2;
         System.out.println("Size of Merged Array is:"+s);
         int arr1[]=new int[n1];
         int arr2[]=new int[n2];
         int mA[]=new int[s];
        System.out.println("Enter elements of 1st Array:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd Array:");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        
        System.out.println("Elements of 1st Array is:");
        for(int i=0;i<n1;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Elements of 2nd Array is:");
        for(int j=0;j<n2;j++)
        {
            System.out.println(arr2[j]);
        }
        
        for(int k=0;k<n1;k++)
        {
            mA[k]=arr1[k];      
        }
        for(int k=0;k<n2;k++)
        {
            mA[k+n1]=arr2[k];     
        }
         System.out.println("Merged Array is:");
        for(int k=0;k<s;k++)
        {
            System.out.println(mA[k]);
        }
      
       
    }
    
}
