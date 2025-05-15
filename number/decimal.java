package number1;
import java.util.*;
class decimal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,i=0;
        double sum=0.0;
            while(n>0)
        {
            rem=n%10;
            sum=sum+rem*Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.print(sum);
    }
}
