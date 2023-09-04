import java.util.*;
public class bin_coeff {

    public static int factorial1(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static int bin_coeffi(int n,int r){
        int fact_n=factorial1(n);
        int fact_r=factorial1(r);
        int fact_nmr=factorial1(n-r);

        int bincoeff=fact_n/(fact_r*fact_nmr);
        return bincoeff;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        int r=sc.nextInt();
        int y=factorial1(num);
        System.out.println(bin_coeffi(num,r));
        System.out.println("factorial of this no is :"+y);
    }

}

    

