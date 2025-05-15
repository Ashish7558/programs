package string;

import java.util.*;
class nov
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        int c=0;
        for(int i=0;i<=l;i++)
        {
            char ch=Str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            c++;
        }
            System.out.println(c);
    }
}