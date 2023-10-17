public class Swap71th {
    public static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    public static void main(String arg[])
    {
        int a=10;
        int b=50;
        swap(a,b);
    }
}
