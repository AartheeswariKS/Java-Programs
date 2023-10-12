package mergeandsortarr;
import java.util.Scanner;
public class MergeandSortArr {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of 1st Array:");
     int n1=sc.nextInt();
     System.out.println("Enter size of 2nd Array:");
     int n2=sc.nextInt();
     int n=n1+n2;
     int arr1[]=new int[n1];
     int arr2[]=new int[n2];
     int mA[]=new int[n];
         
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
        for(int k=0;k<mA.length;k++)
        {
            if(k<arr1.length)
            {
            mA[k]=arr1[k];
            }
            else
            {
            mA[k]=arr2[k-arr1.length];  
            }
            
        }
        
         for(int k=0;k<mA.length;k++)
        {
            for(int k1=k+1;k1<mA.length;k1++)
            if(mA[k]>mA[k1])
            {
                int temp=mA[k];
                mA[k]=mA[k1];
                mA[k1]=temp;
            }
        }
        for(int k=0;k<mA.length;k++)
        {
            System.out.println(mA[k]);
        }
        
        
        
    }
    
}

        

