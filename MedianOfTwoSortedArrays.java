package medianoftwosortedarrays;
import java.util.Arrays;
import java.util.Scanner;
public class MedianOfTwoSortedArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of 1st Array:");
        int n1=sc.nextInt();
        System.out.println("Enter Size of 2nd Array:");
        int n2=sc.nextInt();
        System.out.println("Size Of Merged Array is:");
        int s=n1+n2;
         System.out.println(s);
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
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Elements of 2nd Array is:");
        for(int j=0;j<arr2.length;j++)
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
        System.out.println("Merged Array before Sorting:");
        for(int k=0;k<s;k++)
        {
            System.out.println(mA[k]);
        }
        Arrays.sort(mA);
        System.out.println("Merged Array after Sorting:");
        for(int k=0;k<s;k++)
        {
            System.out.println(mA[k]);
        }
        double median=0;
        if(s%2==0)
        {
           int mid1=(s-1)/2;
           int mid2=s/2;
           median=(double)(mA[mid1]+mA[mid2])/2;
        }
        else
        {
            int mid=(s-1)/2;
            median=mA[mid];
        }  
        System.out.println("The median of these arrays is:"+median);
        
       
    }

    
}
