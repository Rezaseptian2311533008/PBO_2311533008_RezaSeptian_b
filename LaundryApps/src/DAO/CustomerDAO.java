package DAO;

import Model.Customer;
import java.util.List;
import Model.Customer;

public interface CustomerDAO {
	public void save(Customer cs);
	public List<Customer> show();
	public void delete (String id);
	public void update (Customer cs);
	
}