package src.Adapters;

import com.example.generated.KPSPublic;
import com.example.generated.KPSPublicSoap;
import src.Abstract.CustomerCheckService;
import src.Entities.Customer;

public class MernisAdapter implements CustomerCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {
        KPSPublic service = new KPSPublic();
        KPSPublicSoap port = service.getKPSPublicSoap();
        return port.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityIdentity()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getBirthDate().getYear());
    }
}
