package lastduplicateelementinarray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LastDuplicateElementInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Elements of Array are:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
                if(hm.containsKey(arr[i]))     
                     hm.put(arr[i],i);
                else
                    hm.put(arr[i], 1);     
        }

           int lastindex=0;
           int lastduplicate=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(e.getValue()!=1)
            {
              lastindex=e.getValue();
              lastduplicate=e.getKey();    
            }
         
        }
      System.out.println("The last index:"+lastindex);
      System.out.println("The last duplicate:"+ lastduplicate);
        
        
        
        
    }
    
}