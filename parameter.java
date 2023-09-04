import java.util.*;
public class parameter {
 public static void calculatesum(int num1,int num2){
    int sum=num1+num2;
    System.out.println("sum is:"+sum);
 }   
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 no:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    calculatesum(a,b);

    }
    
}

