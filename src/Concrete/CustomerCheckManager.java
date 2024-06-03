package src.Concrete;

import src.Abstract.CustomerCheckService;
import src.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {
        return false;
    }
}
