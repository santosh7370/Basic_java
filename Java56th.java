/* print star pattern like
 *****
 ****
 ***
 **
 *
*/
import java.util.*;
public class Java56th 
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number :");
        int strline=scn.nextInt();
        for(int i=1;i<=strline;i++)
        {
            for(int j=1; j<=strline-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}