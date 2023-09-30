// data type conversion
// java alow only 
// byte->short->int->float->long->double
public class Conversion
{
    public static void main(String arg[])
    {
        int a=12;
        float b=a;
        System.out.println(b);
        // if you will try to like
        float b=23;
        int a=b;
        System.out.println(a); //here show the error at a run time code
    }
}