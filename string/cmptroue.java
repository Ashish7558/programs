package string;

import java.util.*;
public class cmptroue
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ",s1=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
            s=s+ch;
        }
        
            else
           { s=s+ch;
            }
        }
        System.out.println(s);
    }
}
            
           
        