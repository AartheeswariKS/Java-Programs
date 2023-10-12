package mergingarrays;
import java.util.Scanner;
public class MergingArrays 
{
    public static void main(String[] args) {
         int arr1[]=new int[5];
         int arr2[]=new int[5];
         int mA[]=new int[10];
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of 1st Array:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd Array:");
        for(int j=0;j<arr1.length;j++)
        {
            arr2[j]=sc.nextInt();
        }
        
        System.out.println("Elements of 1st Array is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Elements of 2nd Array is:");
        for(int j=0;j<arr2.length;j++)
        {
            System.out.println(arr2[j]);
        }
        
        System.out.println("Merged Array is:");
        for(int k=0;k<5;k++)
        {
            mA[k]=arr1[k];
            mA[k+5]=arr2[k];           
            
        }
        for(int k=0;k<10;k++)
        {
            System.out.println(mA[k]);
        }
        
        
        
    }
    
}
