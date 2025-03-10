public class PaymentProcessing {
    public void makePayment(String creditType, double amount, String cardNumber, String cardEnding){
        if(creditType.equals("Credit"))
            System.out.println("Processing Credit Card payment of $" + amount);
        else if(creditType.equals("Debit"))
            System.out.println("Processing Debit Card payment of $" + amount);
        else
            System.out.println("Unknown Payment Method");
        if(amount > 1000)
            System.out.println("High-value transaction alert!");
        System.out.println("Payment Done for " + cardNumber + " (Card Ending:" + cardEnding.substring(cardEnding.length() - 4) + ")");
    }
}