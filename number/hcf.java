package number1;
import java.util.*;
class hcf
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=x*y;
        int h=0;
        for(int i=1;i<=p;i++)
        {
            if(x%i==0&&y%i==0)
            {h=i;
            }
        }
        System.out.println("hcf="+h);
    }
}
