package string;

import java.util.*;
public class palindrome
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String Str,s=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        Str=str.toUpperCase();
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            s=ch+s;
        }
        if(s.equals(Str))
        System.out.println("palindrome");
        else
        System.out.println(Str+s);
    }
}