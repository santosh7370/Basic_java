import java.io.*;
public class Tildrectangular81
{
    public static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        pattern(10);
    }
}