// print sum of first n natural numbers
import java.util.*;
public class Java39th {
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sn.nextInt();
        int sum=0;
        int i=1;
        while(i<=number)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum of n natural number: = "+sum);
    }
}