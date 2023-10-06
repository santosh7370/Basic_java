// print square pattern using for loop concept
import java.util.*;
public class Java41th {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Square pattern : ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=number;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
