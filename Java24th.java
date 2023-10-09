// Else if condition use in this program
import java.util.*;
public class Java24th
{
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=sn.nextInt();
        if(age>=18){
            System.out.println("You are adult ");
        } else if(age>=13 && age<18){
            System.out.println("You are teenager ");
        } else{
            System.out.println("You are child ");
        }
    }
}