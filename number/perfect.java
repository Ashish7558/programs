package number1;
import java.util.*;
class perfect
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {sum=sum+i;
            }
        }
            if(n==sum)
           System.out.print("perfect");
           else
           System.out.println("not");
     }
}
