// Ternary operator used
// compare two number
import java.util.*;
public class Java27th
{
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the any two number :");
        int a=sn.nextInt();
        int b=sn.nextInt();
        int largest=(a>b)?a:b;
        System.out.println("The largest numbe is = "+largest);
    }
}