// How many times 'Hello' is printed?
import java.util.*;
public class Java50th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Hello ");
            i+=2;
        }
    }
}
