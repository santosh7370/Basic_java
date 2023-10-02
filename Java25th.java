/* income tax calculator
if Income >5lakh
0% tax
if Income between 5L to 10L
20% tax
if Income above > 10L
30% tax
*/
import java.util.*;
public class Java25th
{
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Your Income :");
         int Income=sc.nextInt();
         int Tax;
         if(Income<500000){
            Tax=0;
         } else if(Income>=500000 && Income<=1000000){
            Tax=(int)(Income*0.2); // 20%=0.2
         }else{
            Tax=(int)(Income*0.3); // 30%=0.3
         }
         System.out.println("Your tax is = "+Tax);
    }
}