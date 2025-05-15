package number1;

import java.util.*;
class buzz
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%10==7||n%7==0)
        System.out.print("buzz");
        else
        System.out.println("not");
    }
}
