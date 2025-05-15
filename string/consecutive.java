package string;

import java.util.*;
public class consecutive
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        int c=0;
        System.out.println("enter a string");
        String str=sc.nextLine();
        s=str+" ";
        String Str=s.toUpperCase();
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            char ch1=Str.charAt(i+1);
            if(ch1==ch)
            c++;
            System.out.println(c);
        }
    }
}
            