//
public class Java61th {
    public static void print1()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public static void print2()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=0;j<=10-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {
        print1();
        print2();

    }
}
