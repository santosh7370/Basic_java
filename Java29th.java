// Switch statement
import java.util.*;
public class Java29th
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in 1 to 7 :");
        int num=sc.nextInt();
        switch(num){
        case 1: System.out.println("Sunday");
                    break;
        case 2: System.out.println("Monday");
                    break;
        case 3: System.out.println("Tuesday");
                    break;
        case 4: System.out.println("Wednesday");
                    break;
        case 5: System.out.println("Thursday");
                    break;
        case 6: System.out.println("Friday");
                    break;
        case 7: System.out.println("Saturday");
                    break;
        default: System.out.println("This is invalied number");
        }
    }
}