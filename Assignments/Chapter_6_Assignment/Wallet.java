public class Wallet {

    private float totalMoney;

    public float getTotalMoney() {
        return totalMoney;
    }

    public Wallet(float openAmount) {
        totalMoney = openAmount;
    }

    public void addMoney(float depositAmount) {
        if(depositAmount>0){
            totalMoney += depositAmount;
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void subtractMoney(float debitAmount) {
        if(debitAmount>0 && totalMoney>=debitAmount){
            totalMoney -= debitAmount;
        }
        else{
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}