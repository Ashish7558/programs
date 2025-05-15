package number1;
import java.util.*;
class amicable
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            sum=sum+i;
        }
        for(int j=1;j<=y;j++)
        {
            if(y%j==0)
            sum1=sum1+j;
        }
        if(sum==sum1)
        System.out.print("amicable");
        else
        System.out.println("not");
    }
}
