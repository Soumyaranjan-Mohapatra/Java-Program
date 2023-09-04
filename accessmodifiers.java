 class accessmodifiers {
    public static void main(String args[]){
        Bankaccount myAcc=new Bankaccount();
        myAcc.username="sushree";
        myAcc.setpassword("soumya");
    }
    
}
class Bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
        System.out.println(username);
        System.out.println(password);
    }
}