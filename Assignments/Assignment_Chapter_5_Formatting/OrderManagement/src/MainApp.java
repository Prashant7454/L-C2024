public class MainApp {
    public static void main(String[] args){
        User user = new User("John", "john@example.com");
        OrderProcessing processOrder = new OrderProcessing();
        processOrder.orderDetails(user, "Laptop", 3, 700);
    }
}