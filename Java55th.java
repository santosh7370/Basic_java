/*  Print star pattern like 
*
**
***
****
*****
*/
import java.util.*;
public class Java55th {
    public static void  main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number :");
        int starline=sn.nextInt();
        for(int i=1;i<=starline;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}
