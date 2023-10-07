// keep entering number till user enters a multiple of 10
import java.util.*;
public class Java46th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        do
        {
            System.out.print("Enter your number : ");
            int n=sn.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }while (true);
    }   
}
