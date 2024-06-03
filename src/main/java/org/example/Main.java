package org.example;
import com.example.generated.*;
import src.Abstract.BaseCustomerManager;
import src.Adapters.MernisAdapter;
import src.Concrete.NeroCustomerManager;
import src.Concrete.StarbucksCustomerManager;
import src.Entities.Customer;

import java.sql.Date;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisAdapter());

        Customer customer = new Customer();
        customer.setFirstName("Göksel");
        LocalDate birthDate = LocalDate.of(1995, 12, 12);
        Date javaDate = Date.valueOf(birthDate);
        customer.setBirthDate(javaDate);
        customer.setLastName("yıldızak");
        customer.setNationalityIdentity("11111111111");

        customerManager.saveCustomer(customer);
    }
}