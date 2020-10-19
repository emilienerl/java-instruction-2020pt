import java.util.*;
import java.io.*;
import java.nio.file.*;

public final class CustomerTextFile implements DAO<Customer> {

	private List<Customer> customers = null;
	private Path customersPath = null;
	private File customersFile = null;

	private final String FIELD_SEP = "\t";

	public CustomerTextFile() throws IOException {
		// initialize the class variables
		customersPath = Paths.get("customer.txt");
		customersFile = customersPath.toFile();
		getAll();
	}

	@Override
	public List<Customer> getAll() throws IOException {
		// if the customers file has already been read, don't read it again
		if (customers != null) {
			return customers;
		}

		customers = new ArrayList<>();

		// load the array list with Customer objects created from
		// the data in the file
		return customers;
	}

	@Override
	public Customer get(String email) throws IOException {
		for (Customer c : customers) {
			if (c.getEmail().equals(email)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean add(Customer c) throws IOException {
		customers.add(c);
		return this.saveAll();
	}

	@Override
	public boolean delete(Customer c) throws IOException {
		customers.remove(c);
		return this.saveAll();
	}

	@Override
	public boolean update(Customer newCustomer) throws IOException {
		// get the old customer and remove it
		Customer oldCustomer = this.get(newCustomer.getEmail());
		int i = customers.indexOf(oldCustomer);
		customers.remove(i);

		// add the updated customer
		customers.add(i, newCustomer);

		return this.saveAll();
	}

	private boolean saveAll() {
		// save the Customer objects in the array list to the file

		return true;
	}
}