// check if a number is prime or not
// take number from user
import java.util.*;
public class Java49th {
   public static void main(String arg[])
   {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the positive number : ");
        int number=scn.nextInt();
        if(number==2)
        {
            System.out.println("This numbe is prime number :");
        }
        else 
        {
        boolean isprime=true;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                isprime=false;
            }
        }
        if(isprime==true)
        {
            System.out.println("This number is prinme number :");
        }
        else{
            System.out.println("This number is  not prinme number :");
        }
    }
   } 
}
