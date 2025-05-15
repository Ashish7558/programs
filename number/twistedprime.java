package number1;
import java.util.*;
class twistedprime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int c=0,c1=0;
        int rem,rev=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        {
            while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        for(int j=1;j<=rev;j++)
        {
            if(rev%2==0)
            c1++;
        }
        if(c1==2)
        System.out.print("twisted Prime");
    }
    else
    System.out.print("not");
}
}
    