//Print original number take from user to Reverse number
import java.util.*;
public class Java43th {
   public static void main(String arg[])
   {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Reverse number :");
        int n=scn.nextInt();
        int rev=0;
        while(n>0)
        {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println("Original number : = "+rev);
   } 
}
