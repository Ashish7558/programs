package number1;
import java.util.*;
class pronic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((n%i==0)&&(n%(i+1)==0))
            System.out.print("pronic");
            else
            System.out.println("not");
        }
    }
}
