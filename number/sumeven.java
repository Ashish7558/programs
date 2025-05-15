
package number1;
import java.util.*;
class sumeven
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sum=0;
            while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
