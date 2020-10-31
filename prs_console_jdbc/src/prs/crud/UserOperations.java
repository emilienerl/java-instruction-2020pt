package prs.crud;

import java.util.List;

import prs.business.User;
import prs.database.UserDb;
import prs.exception.PrsDataException;
import prs.ui.Console;

public class UserOperations {

	UserDb user = new UserDb();

	public static void listUsers() {
		UserDb userDb = new UserDb();
		List<User> users = userDb.getAll();
		System.out.println("Users:");
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println();
	}

	public static void deleteUser() {
		UserDb user = new UserDb();
		int deleteId = Console.getInt("User Id to delete: ");
		if (user.delete(deleteId)) {
			System.out.print("deleted successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void updateUser() {
		UserDb user = new UserDb();
		String userName = Console.getString("UserName to update: ");
		String password = Console.getString("Password to update: ");
		String firstName = Console.getString("FirstName to update: ");
		String lastName = Console.getString("LastName to update: ");
		String phoneNumber = Console.getString("PhoneNumber to update: ");
		String email = Console.getString("Email to update: ");

		User userUpdate = new User(0, userName, password, firstName, lastName, phoneNumber, email, false, false);
		if (user.update(userUpdate)) {
			System.out.print("User updated successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void addUser() {
		UserDb user = new UserDb();
		String userName = Console.getString("UserName to add: ");
		String password = Console.getString("Password to add: ");
		String firstName = Console.getString("FirstName to add: ");
		String lastName = Console.getString("LastName to add: ");
		String phoneNumber = Console.getString("PhoneNumber to add: ");
		String email = Console.getString("Email to add: ");
		User userAdd = new User(0, userName, password, firstName, lastName, phoneNumber, email, false, false);
		if (user.add(userAdd)) {
			System.out.print("User added successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static User login() {
		try {
			String userName = Console.getString("UserName: ");
			String password = Console.getString("Password: ");

			UserDb userDb = new UserDb();
			User user = userDb.authenticateUser(userName, password);

			return user;

		} catch (PrsDataException e) {
			System.err.println("Error logging in. Msg: " + e.getMessage());
			return null;
		}
	}
}
