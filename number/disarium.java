package number1;
import java.util.*;
class disarium
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,r,x=1,rev=0,k=n;
        double sum=0.0;
            while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        while(rev>0)
        {
            r=rev%10;
            sum=sum+Math.pow(r,x);
            x++;
            rev=rev/10;
        }
        if(k==sum)
        System.out.print("disarium");
        else
        System.out.println("not");
    }
}
