package Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerSelector {
    private static Connection connection;
    public CustomerSelector(Connection connection) {
        this.connection = connection;
    }

    public List<Customer> getCustomerByField(Field field, String value){
        List<Customer> searchedCustomers = new ArrayList<>();
        String query = "SELECT * FROM customers WHERE "+ field +" = ?";

        try(PreparedStatement searchQueryRunner = connection.prepareStatement(query)){
            searchQueryRunner.setString(1, value);
            try (ResultSet foundCustomer = searchQueryRunner.executeQuery()) {
                while (foundCustomer.next()) {
                    Customer customer = new Customer();
                    customer.setCustomerID(foundCustomer.getInt("customerID"));
                    customer.setCountry(foundCustomer.getString("Country"));
                    customer.setCompany(foundCustomer.getString("Company"));
                    customer.setContact(foundCustomer.getString("Contact"));
                    searchedCustomers.add(customer);
                }
            }
            return searchedCustomers;
        }catch(SQLException e) {
            System.out.println("Issue occured while searching!");
        }
        catch(NullPointerException e) {
            System.out.println("Problem Occured in the query!");
        }
        return null;
    }
}
