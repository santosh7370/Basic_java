
import java.util.*;
public class Table80th 
{
    public static void main(String arg[])
    {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the any number ");
    int n=scn.nextInt();
    for(int i=1;i<=10;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.print(i*j+"\t");
        }
         System.out.println();
    }
    }   
}
