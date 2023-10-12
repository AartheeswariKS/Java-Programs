import java.util.Scanner;

class stackop 
{
    int top=-1;
    Scanner sc=new Scanner(System.in);        
    
    public void push(int st[],int n)
    {
        int x;
        if(top>=n-1)
        {
            System.out.println("Overflow");
        }
        else
        {
             System.out.println("Enter the element to be pushed:");
             x=sc.nextInt();
             top=top+1;
             st[top]=x;
             display(st,n);
        }
        
    }
    public void pop(int st[],int n)
    {
        if(top==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
             System.out.println("The element popped is:"+st[top]);
             top=top-1;
             display(st,n);
        }
    }  
  
 
    public void display(int st[],int n)
    {
     
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Elements in stack are:");
            for(int i=top;i>=0;i--)
            {
              System.out.println(st[i]);
                
            }
        
        }
        
    }
             
}
public class Stackmain
{
    public static void main(String[] args)
    {
        int n=5;
        int st[]=new int[n];
        int ch;
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter size of the stack:");
        n=sc.nextInt();
        stackop s=new stackop();
        do
        {
         System.out.println("Enter choice:");
         ch=sc.nextInt();
         switch(ch)
         {
             case 1:
                 s.push(st,n);
                 break;
             
             case 2:
                 s.pop(st,n);
                 break;
               
             case 3:
                 s.display(st,n);
                 break;
  
             default:
                 System.out.println("Exit");
         }
        }
        while(ch<=4);
    }
}
                 
               
