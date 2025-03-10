import java.util.ArrayList;
import java.util.List;

public class OrderProcessing {
    List<String> orders = new ArrayList<>();

    public void orderDetails (User user, String item, int quantity, double price){
        double total = quantity*price;
        if(quantity > 5) {
            total *= 0.85;
        }
        orders.add("Item: " + item + ", Qty: " + quantity + ", Total: " + total);
        System.out.println("Order Placed!");
        System.out.println("User: " + user.name + ", Item: " + item + ", Quantity: " + quantity + ", Total: " + total);
        if(quantity > 10){
            System.out.println("Bulk Order Alert!");
        }
        sendEmail(user.email, "Order placed for " + item + " with total cost " + total);
    }

    public void sendEmail(String email, String message){
        System.out.println("Sending email to: " + email + " Message: " + message);
    }
}
