//Write a Java program to get a number from the user and print whether it is
//positive or negative.
import java.util.*;
public class Java32th
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the any number :");
        int a=s.nextInt();
        if(a>=0){
            System.out.println("This is a Positive number :");
        } else {
            System.out.println("This is a Negative number :");
        }
    }
}