/*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.*/
import java.util.*;
public class Average
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(" Average of Three number :"+ avg);
    }
}