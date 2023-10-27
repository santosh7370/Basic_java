import java.util.Scanner;

public class DecimalToBinary84th {
    public static void DecimalToBinary(int n)
    {
        int myNum=n;
        int pow=0;
        int biNum=0;
        while(n>0)
        {
            int ram=n%2;
            biNum=biNum+(ram*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary number of " +myNum+" = "+biNum);
    }
    public static void main(String arg[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enten the any positive number ");
        int n=sn.nextInt();
        DecimalToBinary(n);
    }
}
