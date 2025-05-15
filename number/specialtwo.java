package number1;
import java.util.*;
class specialtwo
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
            f=f*rem;
            n=n/10;
        }
        sum=sum+f;
        if(k==sum)
        System.out.print("specialtwo");
        else
        System.out.println("not");
    }
}
