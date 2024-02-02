package swapkthelement;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapKthElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The elements of Array before swapping are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);    
        }
         System.out.println("Enter the K:");
         int k=sc.nextInt();
         int a=k-1;
         int b=n-k;
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
         System.out.println("The elements of Array after swapping are:"); 
         for(int i=0;i<n;i++)
             System.out.println(arr[i]);
         ArrayList<Integer> al=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             al.add(arr[i]);
         }
         System.out.print(al);
    }
    
}
