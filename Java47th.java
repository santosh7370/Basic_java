// continuous Statement
// Use to skip an iteration
import java.util.*;
public class Java47th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sn.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
