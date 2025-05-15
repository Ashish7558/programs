package number1;
import java.util.*;
class tech
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem=n%100;
        int s=n/100;
        int sum=rem+s;
        double k=Math.pow(sum,2);
        if(k==n)
        System.out.print("tech");
        else
        System.out.println("not");
    }
}
