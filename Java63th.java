// Revers pattern shap of piramid
import java.util.*;
public class Java63th 
{
    public static void starprint(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sn.nextInt();
        starprint(n);
    
    }
}