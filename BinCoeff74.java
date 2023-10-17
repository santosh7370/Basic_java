public class BinCoeff73 {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int bincoeffent(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bincoef=fact_n/(fact_r*fact_nmr);
        return bincoef;
    }
    public static void main(String arg[])
    {
        System.out.println("Binomial Coefficent = "+bincoeffent(20, 10));
    }
}
