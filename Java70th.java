import java.util.*;
public class Java70th {
     public static void print1(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print2(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner cn=new Scanner(System.in);
        System.out.println("Enter the pattern number ");
        int n=cn.nextInt();
        print1(n);
        print2(n);
    }
}