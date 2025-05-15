package number1;

import java.util.*;
class prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("prime");
        else
        System.out.print("not");
    }
}
        