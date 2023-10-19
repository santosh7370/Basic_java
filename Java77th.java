//for loop statement 
/* like number pattern 
 * 1      1
 * 12    21
 * 123  321
 * 12344321
 */
import java.util.*;
public class Java77th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
