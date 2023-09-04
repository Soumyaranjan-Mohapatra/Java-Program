import java.util.*;
public class prime {
   public static void main(String args[]){
    int l,u,i,j;
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
u=sc.nextInt();
for(i=l;i<=u;i++)
for(j=2;j<=i-1;j++)
if(i%j==0)
break;
if(j==i)
System.out.println(j);
   }
}
