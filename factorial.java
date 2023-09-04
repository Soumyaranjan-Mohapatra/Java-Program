import java.util.*;
public class factorial {
    public static int factorial1(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        int y=factorial1(num);
        System.out.println("factorial of this no is :"+y);
    }

}
