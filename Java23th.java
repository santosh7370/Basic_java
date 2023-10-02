// Print if a number odd or even
import java.util.*;
public class Java23th
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println(" Enter the any number for Check odd or even ");
        int n=scn.nextInt();
        if(n%2==0){
            System.out.println("This is a even number = "+n);
        } else{
            System.out.println("This is a odd number  = "+n);
        }
    }
}