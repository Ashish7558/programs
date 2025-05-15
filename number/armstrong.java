package number1;

import java.util.*;
class armstrong
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sum=0;
        int k=n;
            while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(k==sum)
        System.out.print("armstrong");
        else
        System.out.println("not");
    }
}
