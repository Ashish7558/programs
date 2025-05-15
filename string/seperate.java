package string;

import java.util.*;
public class seperate
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str+" ";
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            if(ch!=' ')
            s=s+ch;
            else
            s=" ";
        }
            System.out.println(s);
    }
}
            
        
    

            
        