import java.util.*;
public class palindrom {
public static void ispalindrom(int a){
int remainder,reverse=0,temp=a;
while(a>0){
remainder= a%10;
reverse=reverse*10+remainder;
a=a/10;
}
if(reverse==temp)
{
    System.out.println("the no is palindrom:");
}
else
{
    System.out.println("the no not palindrom:");

}
}
 public static void main(String args[]){
Scanner sc=new Scanner( System.in);
int num;
System.out.println("enter num:");
num=sc.nextInt();
//temp=num;
ispalindrom(num);
 }   
    
}
