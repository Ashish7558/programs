package string;

import java.util.*;
class noc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str=sc.nextLine();
        int l=str.length();
        for(int i=0;i<=l;i++)
        {
            char ch=str.charAt(i);
            System.out.println(l);
            System.out.println(ch);
        }
    }
}