import java.util.Scanner;

public class factorial73th {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String arg[])
    {
       // Scanner sn=new Scanner(System.in);
        //System.out.println("Enter the number for find factorial ");
        //int n=sn.nextInt();
        //factorial(n);
        System.out.println(factorial(6));
    }
}
