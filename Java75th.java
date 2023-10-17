import java.util.*;
public class Java75th 
{
    public static void starprint(int n)//user define function
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*n-(2*i);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sn.nextInt();
        starprint(n);
    }
}
