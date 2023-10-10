// function call or method
import java.util.*;
public class Java60th {
    public static int calculate()
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the any two number ");
        int num=sn.nextInt();
        int num2=sn.nextInt();
        int sum=num+num2;
        System.out.println("Two number of sum : = " + sum);
        return sum;
    }
    public static void main(String arg[])
    {
        calculate();
    }
}
