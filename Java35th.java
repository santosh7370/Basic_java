//Write a Java program that takes a year from the user and print whether that
//year is a leap year or not.
import java.util.*;
public class Java35th
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you any year :");
        int year=sc.nextInt();
        boolean a=(year%4)==0;
        boolean b=(year%100)!=0;
        boolean c=((year%100)==0 &&(year%400)==0);
        if(a && (b || c))
        {
            System.out.println("This year is a leap year :");
        } else {
            System.out.println("This year is not a leap year :");
        }
    }
}