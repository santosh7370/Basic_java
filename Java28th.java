// Chech if a student will pass or fail
// if mark>=33 then pass
//if mark<33 then 
// take marks from user and chech using ternary operator
import java.util.*;
public class Java28th
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the your marks :");
        int mark=s.nextInt();
        if(mark>100)
        {
            System.out.println("Your marks is invalied :");
        }
        else{
        String status=(mark>=33)? "Pass":"Fail";
        System.out.println("Your marks status is = "+status);
        }
    }
}