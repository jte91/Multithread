import javax.management.RuntimeErrorException;

public class multithreading 
{
    public static void main(String[] args)
    {
       for(int i = 0; i < 5; i++)
       {
            multithing myting = new multithing(i);
            myting.start();
       }
       throw new RuntimeException();
    }
}
