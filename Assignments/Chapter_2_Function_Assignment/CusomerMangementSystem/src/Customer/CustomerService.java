package Customer;

import CustomerSearch.CustomerSearch;

import java.util.List;
import java.util.StringJoiner;

public class CustomerService {

    private final CustomerSelector selector;

    public CustomerService(CustomerSelector selector) {
        this.selector = selector;
    }

    public List<Customer> searchCustomers(CustomerSearch search, String value) {
        return search.search(selector, value);
    }

    public String exportToCSV(List<Customer> customers) {
        StringJoiner csv = new StringJoiner("\n");
        csv.add("CustomerID,CompanyName,ContactName,Country");

        for (Customer c : customers) {
            csv.add(c.toString());
        }
        return csv.toString();
    }
}
