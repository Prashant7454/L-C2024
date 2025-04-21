package atm.core;

import atm.exception.ATMException;
import atm.model.Account;

import java.util.Scanner;

public class ATMService {
    private final ATM atm;
    private final Server server;
    private final Account account;

    public ATMService(ATM atm, Server server, Account account) {
        this.atm = atm;
        this.server = server;
        this.account = account;
    }

    public void authenticate(Scanner scanner) {
        if (!server.connect()) {
            throw new ATMException("Unable to connect to server.");
        }

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        account.validatePin(pin);
    }

    public void performTransaction(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        if (!atm.hasSufficientCash(amount)) {
            throw new ATMException("ATM doesn't have enough cash.");
        }

        account.withdraw(amount);
        atm.dispenseCash(amount);
        System.out.println("Withdrawal successful. Balance: " + account.getBalance());
    }
}
