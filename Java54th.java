// write a java program to print the given numver is odd/ever 
// using switch case statement
import java.util.*;
public class Java54th {
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the any positive number :");
        int num=scn.nextInt();
        for(int i=1; i<=num; i++)
        {
            switch(i%2)
            {
                case 1:
                System.out.println("This is odd number : = "+i);
                break;
                case 0:
                System.out.println("This is even number : = "+i);
                break;
            }
        }
    }
}
