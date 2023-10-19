// for loop statement
/*
 A
 A B
 A B C
 A B C D
 */
import java.util.*;
public class Java79th {
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
