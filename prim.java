import java.util.*;
public class prim {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int num=sc.nextInt();
        int i;
        for( i=2;i<=num-1;i++)
        { if(num%i==0)
         
            System.out.println("not [prime]");

        }
        if(num==i)
        System.out.println("prime");


    }
    
}
