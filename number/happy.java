package number1;
import java.util.*;
class happy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,rem1,sum=0,s=0;
            while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        while(sum>0)
        {
            rem1=sum%10;
            s=s+(rem1*rem1);
            sum=sum/10;
        }
        if(s==1)
        System.out.print("happy");
        else
        System.out.println("not");
    }
}
