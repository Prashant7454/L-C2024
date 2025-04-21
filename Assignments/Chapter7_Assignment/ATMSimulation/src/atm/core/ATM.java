package atm.core;

public class ATM {
    private int availableCash;

    public ATM(int availableCash) {
        this.availableCash = availableCash;
    }

    public boolean hasSufficientCash(int amount) {
        return amount <= availableCash;
    }

    public void dispenseCash(int amount) {
        if (!hasSufficientCash(amount)) {
            throw new RuntimeException("ATM doesn't have sufficient cash.");
        }
        availableCash -= amount;
    }
}
