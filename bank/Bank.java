package bank;

class Account{
    public String name;//public 
    protected String email;//protected
    private String password; // private

    // getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){

        this.password = pass;

    }
}

public class Bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Collage";
        account1.email = "collage@gmail.com";
        account1.setPassword("ABCD");
        System.out.println(account1.getPassword());

    }
    
}
