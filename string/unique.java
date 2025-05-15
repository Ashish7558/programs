package string;

import java.util.*;
public class unique
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String Str;
        int c=0;
        System.out.println("enter a string");
        String str=sc.nextLine();
        Str=str.toUpperCase();
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                char ch1=Str.charAt(j);
                if(ch1==ch)
                c++;
                break;
            }
        }
            if(c==0)
            System.out.println("unique");
            else
            System.out.println("not unique");
        
    }
}
                