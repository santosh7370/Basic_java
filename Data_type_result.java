//What will be the type of result in the following Java code?
public class Data_type_result
{
    public static void main(String arg[])
    {
        byte b=4;
        char c='A';
        short s=512;
        int i=2345;
        float f=3.14f;
        double d=32.34;
        double result=(f*b)+(i%c)-(d*s);
        System.out.println(result);
    }
}