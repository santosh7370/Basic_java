// Simple calculator using switch statement
// only two number are operation
// using some operator like +,-,*,/,%
import java.util.*;
public class Java31th
{
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the a value :");
        int a=sn.nextInt();
        System.out.println("Enter the b value :");
        int b=sn.nextInt();
        System.out.println("Enter the operator symbol :");
        char operator=sn.next().charAt(0);
        switch(operator)
        {
            case '+' : System.out.println("Addition of two number = "+(a+b));
            break;
            case '-' : System.out.println("Subtraction of two number = "+(a-b));
            break;
            case '*' : System.out.println("Multipication of two number = "+(a*b));
            break;
            case '/' : System.out.println("Division of two number = "+(a/b));
            break;
            case '%' : System.out.println("Modulas of two number = "+(a%b));
            break;
            default : System.out.println(" Sorry ! It is a default for me");
        }
    }
}