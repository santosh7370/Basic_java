/* Print largest number of three
*/
import java.util.*;
public class Java26th
{
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the any Three number :");
        int a=sn.nextInt();
        int b=sn.nextInt();
        int c=sn.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is = "+a);
        } else if(b>c){
            System.out.println("The largest number is ="+b);
        } else{
            System.out.println("The largest number is ="+c);
        }
    }
}