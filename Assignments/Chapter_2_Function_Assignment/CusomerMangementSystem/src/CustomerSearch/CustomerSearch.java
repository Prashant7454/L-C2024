package CustomerSearch;

import Customer.Customer;
import Customer.CustomerSelector;

import java.util.List;

public interface CustomerSearch {
    List<Customer> search(CustomerSelector Selector, String value);
}
