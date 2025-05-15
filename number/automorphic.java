package number1;
import java.util.*;
class automorphic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,sq=n*n,c=0;
        int k=sq;
            while(sq>0)
        {
            rem=sq%10;
            c++;
            sq=sq/10;
        }
        if(n==Math.pow(sq,c))
        System.out.print("automorphic");
        else
        System.out.println("not");
    }
}
