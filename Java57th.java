/* Print Alphabate pattern like
A
BC
DEF
GHIJ
*/
import java.util.*;
public class Java57th {
    public static void main(String arg[])
    {
        Scanner cn=new Scanner(System.in);
        System.out.println("Enter the line number :");
        int line=cn.nextInt();
        char ch='A';
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
