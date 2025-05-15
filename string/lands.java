package string;

import java.util.*;
class lands
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ",p=" ",y=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str+' ';
        int r=Str.indexOf(' ');
        String m=Str.substring(0,r);
        int k=m.length();
        int max=k,min=k;
        int l=Str.length();
        for(int i=0;i<l;i++)
        {
            char ch=Str.charAt(i);
            if(ch!=' ')
            s=s+ch;
            else
            {
                int z=s.length();
                if(max<=z)
                {
                    max=z;
                    p=s;
                    s=" ";
                }else 
                    if(min>=z)
                    {
                        min=z;
                        y=s;
                        s=" ";
                    }
                }
            }
            System.out.println("longest word="+p);
            System.out.println("smallest word="+y);
        }
    }

                        
            
            
  
        
