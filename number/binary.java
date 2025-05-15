package number1;
import java.util.*;
class binary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,rev=0;
            while(n>0)
        {
            rem=n%2;
            rev=rev*10+rem;
            n=n/2;
        }
        System.out.println(rev);
    }
}
