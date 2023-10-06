// Write a program using Do while loop
import java.util.*;
public class Java44th {
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=scn.nextInt();
        int counter=1;
        do
        {
            System.out.println(" Hello World :");
            counter++;
        }
        while(counter<=num);
    }  
}
