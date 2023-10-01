// Logical Operators
// && (logical AND) 
// || (logical OR)
// ! (logical NOT)
public class Java15th
{
    public static void main(String arg[])
    {
        int a=32;
        int b=23;
        int c=14;
        System.out.println((a>b) && (a>c)); //should be both condition true or false
        System.out.println((a<b) || (a<c)); //If any one condition true then print value is true
        System.out.println(!(a>c)); // this is given result value opposite result like if condition is true then print value is false
    }
}