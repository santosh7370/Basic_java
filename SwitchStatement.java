import java.util.*;
public class SwitchStatement
{
    public static void main( String args [])
    {
        int days ;
        System.out.println("Enter your no for days");
        Scanner sc = new Scanner(System.in);
        days =sc.nextInt();
        switch (days) 
        {
            case 1:
                     System.out.println("sunday");
                     break;
            case 2:
                    System.out.println("monday");
                    break;
            case 3: 
                    System.out.println("tuesday");
                    break;
            case 4: 
                    System.out.println( "wednesday");
                    break;
            case 5:
                    System.out.println("thrusday");
                    break;
            case 6: 
                     System.out.println( "friday");
                     break;
            case 7: 
                   System.out.println("saturday");
                   break;
            default:
                   System.out.println("out of range");
                   break;
        }
    }
}