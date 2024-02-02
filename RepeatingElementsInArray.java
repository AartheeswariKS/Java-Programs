package repeatingelementsinarray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RepeatingElementsInArray 
{
    public static void main(String[] args) 
    {
        int max=Integer.MIN_VALUE;
        int val=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           if(hm.containsKey(arr[i]))
               hm.put(arr[i], hm.get(arr[i])+1);
           else
               hm.put(arr[i], 1);
       }
       System.out.println(hm);
      ArrayList<Integer> a=new ArrayList<>();
       for(Map.Entry<Integer,Integer>e:hm.entrySet())
       {
           int count=e.getValue(); 
           if(count!=1)
              a.add(e.getKey());
         
       }
        System.out.println(a);
        

    }   
}
