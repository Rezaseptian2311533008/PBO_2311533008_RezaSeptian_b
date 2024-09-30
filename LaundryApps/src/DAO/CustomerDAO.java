package DAO;

import java.util.List;

import Model.Customer;

public interface CustomerDAO {
	void save(Customer customer);
	public List<Customer> show();
	public void delete (String id);
	public void update (Customer customer);
	
}