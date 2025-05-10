package CustomerSearch;

import Customer.Customer;
import Customer.CustomerSelector;
import Customer.Field;

import java.util.List;

public class SearchByCompany implements CustomerSearch{
    @Override
    public List<Customer> search(CustomerSelector Selector, String value) {
        return Selector.getCustomerByField(Field.company , value);
    }
}
