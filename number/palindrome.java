package number1;

import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,rev=0;
        int k=n;    
            while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(k==rev)
        System.out.print("palindrome");
        else
        System.out.println("not");
    }
}
