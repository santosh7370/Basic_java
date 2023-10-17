public class Multiply72th {
    public static int multiply(int a,int b)
    {
        int product=a*b;
        return product;
    }
    public static void main(String arg[])
    {
        int a=10;
        int b=25;
        int prod = multiply(a,b);
        System.out.println("a*b = "+prod);
        prod = multiply(10,30);
        System.out.println("a*b = "+prod);
    }
}
