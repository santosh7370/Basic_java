// print number from 1 to n
import java.util.*;
public class Java38th {
   public static void main(String arg[])
   {
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter the number :");
    int num=sn.nextInt();
    int i= 1;
    while(i<=num)
    {
        System.out.println("Print number : "+i);
        i++;
    }
    System.out.println("Finaly all n number are printed ");
   } 
}
