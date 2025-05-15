package number1;
import java.util.*;
class special
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sum=0;
        int k=n;
        int f=1;
            while(n>0)
        {
            rem=n%10;
            for(int i=1;i<=rem;i++)
            {
             f=f*i;
            }
             sum=sum+f;
            n=n/10;
        }
        if(k==sum)
        System.out.print("special");
        else
        System.out.println("not");
    }
}
