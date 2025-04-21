package atm.model;

import atm.exception.ATMException;

public class Account {
    private final String pin;
    private int balance;
    private int pinAttempts;
    private boolean blocked;
    private int dailyWithdrawn;

    private static final int DAILY_LIMIT = 5000;

    public Account(String pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void validatePin(String inputPin) {
        if (blocked) throw new ATMException("Card is blocked.");
        if (!pin.equals(inputPin)) {
            pinAttempts++;
            if (pinAttempts >= 3) {
                blocked = true;
                throw new ATMException("Card blocked after 3 invalid attempts.");
            }
            throw new ATMException("Invalid PIN. Attempts: " + pinAttempts);
        }
        pinAttempts = 0; // Reset on success
    }

    public void withdraw(int amount) {
        if (amount > balance) throw new ATMException("Insufficient account balance.");
        if (dailyWithdrawn + amount > DAILY_LIMIT)
            throw new ATMException("Daily limit exceeded.");
        balance -= amount;
        dailyWithdrawn += amount;
    }

    public int getBalance() {
        return balance;
    }
}
