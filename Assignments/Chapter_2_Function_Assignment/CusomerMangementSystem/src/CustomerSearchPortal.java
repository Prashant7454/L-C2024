import Customer.Customer;
import Customer.CustomerSelector;
import Customer.CustomerService;
import CustomerSearch.SearchByCompany;
import CustomerSearch.SearchByContact;
import CustomerSearch.SearchByCountry;
import DataBaseConnection.DataBaseConnection;

import java.sql.Connection;
import java.util.List;

public class CustomerSearchPortal {
    public static void main(String[] args) {
        Connection connection = DataBaseConnection.getDBConnection();
        CustomerSelector repository = new CustomerSelector(connection);
        CustomerService service = new CustomerService(repository);

        List<Customer> countryResults = service.searchCustomers(new SearchByCountry(), "USA");
        System.out.println("Search by Country (USA):");
        System.out.println(service.exportToCSV(countryResults));

        List<Customer> companyResults = service.searchCustomers(new SearchByCompany(), "Tech");
        System.out.println("\nSearch by Company Name (Tech):");
        System.out.println(service.exportToCSV(companyResults));

        List<Customer> contactResults = service.searchCustomers(new SearchByContact(), "John");
        System.out.println("\nSearch by Contact Name (John):");
        System.out.println(service.exportToCSV(contactResults));
    }
}