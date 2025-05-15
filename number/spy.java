package number1;
import java.util.*;
class spy
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sum=0,p=1;
            while(n>0)
        {
            rem=n%10;
            p=rem*p;
            sum=sum+rem;
            n=n/10;
        }
        if(p==sum)
        System.out.print("spy");
        else
        System.out.println("not");
    }
}
