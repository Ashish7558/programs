package number1;

import java.util.*;
class primepalindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,rev=0;
        int k=n;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;}
            if(c==2)
            {
            while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(k==rev)
        System.out.print("primepalindrome");
        else
        System.out.println("not");
        }
        else
         System.out.print("not");
    }
}
