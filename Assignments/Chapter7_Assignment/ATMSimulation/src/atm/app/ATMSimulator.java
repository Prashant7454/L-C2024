package atm.app;

import atm.core.ATM;
import atm.core.ATMService;
import atm.core.Server;
import atm.exception.ATMException;
import atm.model.Account;

import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        ATMService atmService = new ATMService(
                new ATM(500),
                new Server(),
                new Account("1234", 10000)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        try {
            atmService.authenticate(scanner);
            atmService.performTransaction(scanner);
        } catch (ATMException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
