import java .util.*;
public class rev {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no:");
     int num=sc.nextInt();
     int reverse=0;
     while(num>0)
     {
        reverse=reverse*10+num%10;
        num=num/10;
     }
     System.out.println("now the no is:"+reverse);
    }
    
}
