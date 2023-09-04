

public class inheritance {
    public static void main(String args[]){
        fish tuna=new fish();
        tuna.eat();
    }
}
    class animal{
        String colour;
        void eat(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathe");
        }
    }
    class fish extends animal{
        String fins="sushree";
        void swim(){
            System.out.println("swims in water");
        }
    }

