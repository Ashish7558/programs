package number1;

import java.util.*;
class neon
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sum=0;
        int sq=n*n;
            while(sq>0)
        {
            rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if(n==sum)
        System.out.print("neon");
        else
        System.out.println("not");
    }
}
