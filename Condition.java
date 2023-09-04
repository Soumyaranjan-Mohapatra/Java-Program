import java.util.*;
public class Condition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter week no (1-7):");
        int week=sc.nextInt();
        switch(week)
        {
            case 1:
                  System.out.println("sunday");
                  break;
            case 2:
                  System.out.println("monday");
                  break;
             case 3:
                  System.out.println("tuesday");
                  break;
             case 4:
                  System.out.println("wed");
                  break;
             case 5:
                  System.out.println("thurs");
                  break;
            case 6:
                  System.out.println("sriday");
                  break;
            case 7:
                  System.out.println("satarday");
                  break;

              default:  
                   System.out.println("invalid ");
        }
    }



    
}
