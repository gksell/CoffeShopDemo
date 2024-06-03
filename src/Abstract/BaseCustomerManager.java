package src.Abstract;

import src.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void saveCustomer(Customer customer) throws Exception {
        System.out.println("VT Kaydedildi, " + customer.getFirstName());
    }
}
