import java.util.Scanner;

public class Swaping 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Welcome to Swaping Station \n");
        System.out.print("Please enter the value of A : ");
        int a=scn.nextInt();
        System.out.print("Please enter the value of B : ");
        int b=scn.nextInt();
        System.out.println("Swaping is done .............");
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of A is : " + a);
        System.out.print("Value of B is : " + b);
    }
}
