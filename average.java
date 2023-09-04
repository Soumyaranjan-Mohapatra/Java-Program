import java.util.*;
public class average {
    public static int avg(int a,int b,int c){
        return (a+b+c)/2;
    }
    public static boolean isEven(int n){
        if(n%2==0)
        return true;
        else
        return false;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c,store;
        System.out.println("enter a,b,c:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        store= avg(a,b,c);
        //isEven(a);
        System.out.println(isEven(a));
        System.out.println("the average of three no is:"+store);
         
        

    }
}
    

