// for looping statement 
/* LIKE
 1
 2 3
 4 5 6
 7 8 9 10
 */
import java.util.*;
public class Java78th {
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=scn.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
}
