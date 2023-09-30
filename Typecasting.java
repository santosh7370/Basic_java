// if java is not alow to conversion then we will try to 
// using type casting method and it alow by java
public class Typecasting
{
    public static void main(String arg[])
    {
        float b=123.5f;
        int a = (int)b;
        System.out.println(a); //this is called lossy conversion technique
        double x=34.45;
        byte y=(byte)x;
        System.out.println(y);
    }
}