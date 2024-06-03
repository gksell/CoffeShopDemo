package src.Concrete;

import src.Abstract.BaseCustomerManager;
import src.Abstract.CustomerCheckService;
import src.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void saveCustomer(Customer customer) throws Exception {

        if (customerCheckService.checkCustomer(customer)) {
            // Kayıt işlemleri
            System.out.println("Doğrulama başarılı");
            super.saveCustomer(customer);
        }else {
            throw new Exception("Müşteri doğrulanamamaktadır!");
        }

    }
}
