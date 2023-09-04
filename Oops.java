public class Oops {
    public static void main(String args[]){
        Pen p1=new Pen();//created a pen object called p1
        p1.setcolour("blue");
        System.out.println(p1.colour);


    }
}
class Pen{
    //properties
    String colour;
    int tip;
    //functions
    void setcolour(String newcolour){
        colour=newcolour;
    }
        void setTip(int newTip){
            tip=newTip;
        }

    }





