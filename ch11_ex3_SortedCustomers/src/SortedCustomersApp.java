import java.util.Arrays;

public class SortedCustomersApp {

	public static void main(String[] args) {

		Customer[] customers = new Customer[3];

		customers[0] = new Customer("emilie@enerl.com", "Emilie", "Nerl");
		customers[1] = new Customer("richardbeck083@gmail.com", "Rick", "Beck");
		customers[2] = new Customer("briehubbs@gmail.com", "Brie", "Hubbs");

		Arrays.sort(customers);

		for (Customer c : customers)

			System.out.println(c.getEmail() + " " + c.getFirstName() + " " + c.getLastName());
	}
}
