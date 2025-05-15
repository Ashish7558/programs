package string;

import java.util.*;
public class repeated
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        String STR=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            if(ch!=' ')
            s=s+ch;
            for(int j=i+1;j<l;j++)
            {
                char ch1=Str.charAt(j);
                if(ch1==ch)
                STR=Str.replace(ch,' ');
            }
        }
        System.out.println(STR);
    }
}                