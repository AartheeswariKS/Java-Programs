package testcompartment;
import java.util.Random;
abstract class Compartment
{
   public abstract String notice();
}
class FirstClass extends Compartment
{

    @Override
    public String notice() {
      return "This is First class Rail Coach";
    }
    
}
class LadiesClass extends Compartment
{
    @Override
    public String notice() {
      return "This is Ladies Rail Coach";
    }
    
}
class GeneralClass extends Compartment
{
    
    @Override
    public String notice() {
      return "This is General class Rail Coach";
    }
    
}
class LuggageClass extends Compartment
{
    @Override
    public String notice() {
      return "This is a Luggage class Rail Coach";
    }
    
}
public class TestCompartment 
{
    public static void main(String[] args) 
    {
        Random n=new Random();
        int randnum=n.nextInt(5);
       Compartment c1=new FirstClass();
       Compartment c2=new LadiesClass();
       Compartment c3=new GeneralClass();
       Compartment c4=new LuggageClass();
        switch (randnum) {
            case 1:
                System.out.println("Rail Coach Number is "+randnum);
                System.out.println(c1.notice());
                break;
            case 2:
                System.out.println("Rail Coach Number is "+randnum);
                System.out.println(c2.notice());
                break;
            case 3:
                System.out.println("Rail Coach Number is "+randnum);
                System.out.println(c3.notice());
                break;
            case 4:
                System.out.println("Rail Coach Number is "+randnum);
                System.out.println(c4.notice());
                break;
            default:
                System.out.println("Rail Coach Number is "+randnum);
                System.out.println("Invalid compartment");
                break;
        }

    }
    
}
