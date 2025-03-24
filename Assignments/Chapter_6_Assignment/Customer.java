public class Customer {

    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public Customer(int initialAmount){
        myWallet = new Wallet(initialAmount);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Wallet getWallet(){
        return myWallet;
    }
}