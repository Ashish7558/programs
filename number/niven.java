package number1;
import java.util.*;
class niven
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
        if(k%sum==0)
        System.out.print("niven");
        else
        System.out.println("not");
    }
}
