import java.util.*;
public class ashish
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int bill=0,bill1=0,bill2=0,tbill=0,i;
        for(i=1;i<=5;i++)
        {
        System.out.println("welcome to the adventure land");
        System.out.println("please enter your name");
        String name=sc.nextLine();
        System.out.println("please enter your mobile number");
        long num=sc.nextLong();
        System.out.println("enter the service you want to take");
        System.out.println();
        String str="yes";
        while(str.equalsIgnoreCase("yes"))
        {
            System.out.println("\t\t\t\t   MAIN MENU  \t\t\t\t");
            System.out.println("\t\t\t\tEnter 1 for water rides\t\t\t\t");
            System.out.println("\t\t\t\tEnter 2 for adventure rides\t\t\t\t");
            System.out.println("\t\t\t\tEnter 3 for food court\t\t\t\t");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("\t\t\t\t water rides \t\t\t\t");
                System.out.println("enter the rides you want to choose");
                System.out.println("\trides      price per person");
                System.out.println("1:Splash Down       115/-");
                System.out.println("2:Mammoth           120/-");
                System.out.println("3:King Cobra        120/-");
                System.out.println("4:Log Chute         135/-");
                System.out.println("5:Mountain Logride  150/-");
                System.out.println("6:Splash Pool       160/-");
                System.out.println("7:River battel      175/-");
                System.out.println("8:Flow Battle       190/-");
                System.out.println("9:Congo River       199/-");
                System.out.println("10:Roman Rapids     199/-");
                String str1="yes";
                while(str1.equalsIgnoreCase("yes"))
                {
                    int ch1=sc.nextInt();
                    sc.nextLine();
                    switch(ch1)
                    {
                        case 1:
                        System.out.println("Splash Down");
                        bill=bill+120;
                        System.out.println("do you want to take another ride");
                        String s=sc.nextLine();
                        str1=s;
                        break;
                        case 2:
                        System.out.println("Mammoth");
                        bill=bill+120;
                        System.out.println("do you want to take another ride");
                        String s1=sc.nextLine();
                        str1=s1;
                        break;
                        case 3:
                        System.out.println("King Cobra");
                        bill=bill+120;
                        System.out.println("do you want to take another ride");
                        String s2=sc.nextLine();
                        str1=s2;
                        break;
                        case 4:
                        System.out.println("Log Chute");
                        bill=bill+135;
                        System.out.println("do you want to take another ride");
                        String s3=sc.nextLine();
                        str1=s3;
                        break;
                        case 5:
                        System.out.println("Mountain Logride");
                        bill=bill+150;
                        System.out.println("do you want to take another ride");
                        String s4=sc.nextLine();
                        str1=s4;
                        break;
                        case 6:
                        System.out.println("Splash Pool");
                        bill=bill+160;
                        System.out.println("do you want to take another ride");
                        String s5=sc.nextLine();
                        str1=s5;
                        break;
                        case 7:
                        System.out.println("River Battle");
                        bill=bill+175;
                        System.out.println("do you want to take another ride");
                        String s6=sc.nextLine();
                        str1=s6;
                        break;
                        case 8:
                        System.out.println("Flow Rider");
                        bill=bill+190;
                        System.out.println("do you want to take another ride");
                        String s7=sc.nextLine();
                        str1=s7;
                        break;
                        case 9:
                        System.out.println("Congo River");
                        bill=bill+199;
                        System.out.println("do you want to take another ride");
                        String s8=sc.nextLine();
                        str1=s8;
                        break;
                        case 10:
                        System.out.println("Roman Rapids");
                        bill=bill+199;
                        System.out.println("do you want to take another ride");
                        String s9=sc.nextLine();
                        str1=s9;
                        break;
                    }
                }
                break;
                
                
                case 2:
                System.out.println("\t\t\t\t Normal rides \t\t\t\t");
                System.out.println("enter the rides you want to enjoy");
                System.out.println("\trides      price per person");
                System.out.println("1:Carouse           115/-");
                System.out.println("2:Wipeout           120/-");
                System.out.println("3:Swing Ride        120/-");
                System.out.println("4:Log Flume         135/-");
                System.out.println("5:Loop O Plane      150/-");
                System.out.println("6:Bumper Cars       160/-");
                System.out.println("7:Giant Wheel       175/-");
                System.out.println("8:Ali Baba          190/-");
                System.out.println("9:Booster           199/-");
                System.out.println("10:Condor           199/-");
                String str2="yes";
                while(str2.equalsIgnoreCase("yes"))
                {
                    int ch2=sc.nextInt();
                    sc.nextLine();
                    switch(ch2)
                    {
                        case 1:
                        System.out.println("Carouse");
                        bill1=bill1+120;
                        System.out.println("do you want to take another ride");
                        String s=sc.nextLine();
                        str2=s;
                        break;
                        case 2:
                        System.out.println("Wipeout");
                        bill1=bill1+120;
                        System.out.println("do you want to take another ride");
                        String s1=sc.nextLine();
                        str2=s1;
                        break;
                        case 3:
                        System.out.println("Swing Ride");
                        bill1=bill1+120;
                        System.out.println("do you want to take another ride");
                        String s2=sc.nextLine();
                        str2=s2;
                        break;
                        case 4:
                        System.out.println("Log Flume");
                        bill1=bill1+135;
                        System.out.println("do you want to take another ride");
                        String s3=sc.nextLine();
                        str2=s3;
                        break;
                        case 5:
                        System.out.println("Loop O Plane");
                        bill1=bill1+150;
                        System.out.println("do you want to take another ride");
                        String s4=sc.nextLine();
                        str2=s4;
                        break;
                        case 6:
                        System.out.println("Bumper cars");
                        bill1=bill1+160;
                        System.out.println("do you want to take another ride");
                        String s5=sc.nextLine();
                        str2=s5;
                        break;
                        case 7:
                        System.out.println("Giant Wheel");
                        bill1=bill1+175;
                        System.out.println("do you want to take another ride");
                        String s6=sc.nextLine();
                        str2=s6;
                        break;
                        case 8:
                        System.out.println("Ali Baba");
                        bill1=bill1+190;
                        System.out.println("do you want to take another ride");
                        String s7=sc.nextLine();
                        str2=s7;
                        break;
                        case 9:
                        System.out.println("Booster");
                        bill1=bill1+199;
                        System.out.println("do you want to take another ride");
                        String s8=sc.nextLine();
                        str2=s8;
                        break;
                        case 10:
                        System.out.println("Condor");
                        bill1=bill1+199;
                        System.out.println("do you want to take another ride");
                        String s9=sc.nextLine();
                        str2=s9;
                        break;
                    }
                }
                break;
                
                
                case 3:
                System.out.println("\t\t\t\t   FOOD COURTT \t\t\t\t");
                System.out.println("\tQuick Snaks     price per serving");
                System.out.println("1:Cheese Burger                40/-");
                System.out.println("2:French Fries                 40/-");
                System.out.println("3:Hot Dog                      50/-");
                System.out.println("4:White Sause Pasta            60/-");
                System.out.println("5:Spring Rool                  60/-");
                System.out.println("6:Fried Momos                  60/-");
                System.out.println("7:coca cola500ml               75/-");
                System.out.println("8:Pepsi500ml                   75/-");
                System.out.println("9:Choco Vanilla Cone           99/-");
                System.out.println("10:magnum classic almond       99/-");
                String str3="yes";
                while(str3.equalsIgnoreCase("yes"))
                {
                    int ch3=sc.nextInt();
                    sc.nextLine();
                    switch(ch3)
                    {
                        case 1:
                        System.out.println("Cheese Burger");
                        System.out.println("enter the quantity of food you want to order");
                        int q=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q*40);
                        System.out.println("do you want to order some thing else..");
                        String s=sc.nextLine();
                        str3=s;
                        break;
                         case 2:
                        System.out.println("French Fries");
                        System.out.println("enter the quantity of food you want to order");
                        int q1=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q1*40);
                        System.out.println("do you want to order some thing else..");
                        String s1=sc.nextLine();
                        str3=s1;
                        break;
                         case 3:
                        System.out.println("Hot Dog");
                        System.out.println("enter the quantity of food you want to order");
                        int q2=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q2*50);
                        System.out.println("do you want to order some thing else..");
                        String s2=sc.nextLine();
                        str3=s2;
                        break;
                         case 4:
                        System.out.println("White Sause Pasta");
                        System.out.println("enter the quantity of food you want to order");
                        int q3=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q3*60);
                        System.out.println("do you want to order some thing else..");
                        String s3=sc.nextLine();
                        str3=s3;
                        break;
                         case 5:
                        System.out.println("Spring Roll");
                        System.out.println("enter the quantity of food you want to order");
                        int q4=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q4*60);
                        System.out.println("do you want to order some thing else..");
                        String s4=sc.nextLine();
                        str3=s4;
                        break;
                         case 6:
                        System.out.println("Fried Momos");
                        System.out.println("enter the quantity of food you want to order");
                        int q5=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q5*60);
                        System.out.println("do you want to order some thing else..");
                        String s5=sc.nextLine();
                        str3=s5;
                        break;
                         case 7:
                        System.out.println("Coca Cola 500ml");
                        System.out.println("enter the quantity of food you want to order");
                        int q6=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q6*75);
                        System.out.println("do you want to order some thing else..");
                        String s6=sc.nextLine();
                        str3=s6;
                        break;
                         case 8:
                        System.out.println("pepsi 500ml");
                        System.out.println("enter the quantity of food you want to order");
                        int q7=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q7*75);
                        System.out.println("do you want to order some thing else..");
                        String s7=sc.nextLine();
                        str3=s7;
                        break;
                         case 9:
                        System.out.println("Choco vanilla cone");
                        System.out.println("enter the quantity of food you want to order");
                        int q8=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q8*99);
                        System.out.println("do you want to order some thing else..");
                        String s8=sc.nextLine();
                        str3=s8;
                        break;
                         case 10:
                        System.out.println("Magnum Classic Almond");
                        System.out.println("enter the quantity of food you want to order");
                        int q9=sc.nextInt();
                        sc.nextInt();
                        bill2=bill2+(q9*99);
                        System.out.println("do you want to order some thing else..");
                        String s9=sc.nextLine();
                        str3=s9;
                        break;
                    }
                }
            }
            System.out.println("to return to main menuenter 'yes' else 'no'");
            str=sc.nextLine();
        }
        tbill=bill+bill1+bill2;
        System.out.println("\t\t\t*****BILL*****\t\t\t");
        System.out.println("\t\tNAME:-\t\t"+name);
        System.out.println("\t\tMOBILE NUMBER:-\t\t"+num);
        System.out.println("\n\n");
        System.out.println("\t\t\t***WATER PARK BILL***\t\t\t");
        System.out.println("total Cost Of Water park bill=\tRs"+bill);
        System.out.print("/-only");
        System.out.println("\t\t\t***AMUSEMENT PARK BILL***\t\t\t");
        System.out.println("total Cost Of Amusement park bill=\tRs"+bill1);
        System.out.print("/-only");
        System.out.println("\n\n");
        System.out.println("\t\t\t***Food Court BILL***\t\t\t");
        System.out.println("total Cost Of Fod Court=\tRs"+bill2);
        System.out.print("/-only");
        System.out.println("\n\n");
        System.out.println("\t\t\tTOTAL BILL=\tRs"+tbill);
        System.out.print("/-only");
        System.out.println("\n\n");
        System.out.println("\t\t\t***THANKS FOR VISITING ADVENTURE ISLAND***\t\t\t");
        System.out.println("\t\t\t\t*****ENJOY*****\t\t\t\t");
        System.out.println();
         }
    }                 
}