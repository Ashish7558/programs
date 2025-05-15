package number1;
import java.util.*;
class sad
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,rem1,sum=0,s=0,k=n;
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
        if(k!=s)
        System.out.print("sad");
        else
        System.out.println("not");
    }
}
