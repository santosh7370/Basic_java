// Overloading parameter and data type
import java.util.*;
public class Java76th
{
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int sum(int a,int b, int c)
    {
        int sum=a+b+c;
        return sum;
    }
    public static void main (String arg[])
    {
        System.out.println("a+b = "+sum(10, 120));
        System.out.println("a+b+c = "+sum(120, 210, 3012));
    }
}