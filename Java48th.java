// Display all numbers entered by user except multiple of 10
import java.util.*;
public class Java48th {
   public static void main(String arg[]) 
   {
    Scanner scn=new Scanner(System.in);
    do
    {
        System.out.println("Enter the number :");
        int num=scn.nextInt();
        if(num%10==0)
        {
            continue;
        }
        System.out.println(num);
    }while(true);
   }
}
