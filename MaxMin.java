class difference
{
    static int a[]={88,89,19,66,99};
    static void MinMax()
    {
        int min,max;
        min=max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i]; 
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }
         System.out.println("Min is :"+min);
         System.out.println("Max is :"+max);
        int difference=max-min;
        System.out.println("Difference between maximum and minimum element is "+difference); 
    }
}
public class NewMain
{
    public static void main(String[] args)
    {
        difference.MinMax();
    }
    
}
