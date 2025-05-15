package number1;

import java.util.*;
class coprime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0,c1=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        for(int j=1;j<=k;j++)
        {
            if(k%j==0)
            c1++;
        }
        if(c==2&&c1==2)
        {
            if((n-k==2)||(k-n==2))
            System.out.print("coprime");
            else
            System.out.print("not");
        }
    }
}
