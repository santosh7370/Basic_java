/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill
*/
import java.util.*;
public class Totalcost
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float total=a+b+c;
        System.out.println("Total cost of items :" + total);
    }
}