//Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class Java52th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the any positive number :");
        int num=sn.nextInt();
        long  fact=1;
        for(int i=1; i<=num; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of number : = " + fact);
    }
}
