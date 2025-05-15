package string;

import java.util.*;
public class piglatin
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            break;
        
        String s1=Str.substring(0,i+1);
        String s2=Str.substring(i+1);
        
            System.out.println(s2+s1+"AY");
    }
}
     }       
        
    

            
        