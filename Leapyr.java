import java.util.*;
public class Leapyr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        int year=sc.nextInt();
        if(year%100==0)
        {
            if(year%400==0)
            System.out.println("lapyear");
            else
               System.out.println("not a ly");
        }
        else
        {
            if(year%4==0)
            System.out.println("LY");
            else
            System.out.println("not a Ly");

        }
    }
    
}
