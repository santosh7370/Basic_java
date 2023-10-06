//Print reverse of number
import java.util.*;
public class Java42th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number for reverse print :");
        int n=sn.nextInt();
        while(n>0)
        {
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
        System.out.println();
    }
}
