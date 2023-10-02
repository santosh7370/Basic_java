// Write a Java program that it print You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.
import java.util.*;
public class Java33th
{
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the your body temperature :");
        double temp=sn.nextDouble();
        if(temp>100){
            System.out.println("You have a fever :");
        } else {
            System.out.println("You don't have a fever :");
        }
    }
}