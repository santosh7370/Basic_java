/*In a program, input the side of a square. You have to output the area of the
square.
*/
import java.util.*;
public class Square_area
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int side=s.nextInt();
        int area=side*side;
        System.out.println(" Area of Square :" + area);
    }
}