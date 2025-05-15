package number1;
import java.util.*;
class maxmin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,max=n%10,min=n%10;
            while(n>0)
        {
            rem=n%10;
            if(rem>max)
            {
                max=rem;
            }
            else
            if(rem<min)
            {
                min=rem;
            }
            n=n/10;
        }
       
        System.out.print(max);
        System.out.println(min);
    }
}
