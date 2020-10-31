package prs.ui;

import prs.business.User;
import prs.crud.ProductOperations;
import prs.crud.UserOperations;

public class PrsApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the PRS App");
		System.out.println();

		System.out.println("COMMANDS");
		System.out.println("login - user login");
		System.out.println("prod_la - List all products");
		System.out.println("prod_get - Get a product");
		System.out.println("user_la - List all users");
		System.out.println("prod_del - Delete a product");
		System.out.println("user_del - Delete a user");
		System.out.println("prod_upd - Update a product");
		System.out.println("user_upd - Update a user");
		System.out.println("prod_add - Add a product");
		System.out.println("user_add - Add a user");
		System.out.println("exit - Exit the application");
		System.out.println();

		User authenticatedUser = null;

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command: ");

			if (command.equalsIgnoreCase("login")) {
				authenticatedUser = UserOperations.login();

				if (authenticatedUser == null) {
					System.out.println("Username/Password not found");
				} else {
					System.out.println("Welcome, " + authenticatedUser.getFirstName());
				}

			} else if (command.equalsIgnoreCase("logout")) {
				authenticatedUser = null;
			} else if (authenticatedUser != null) {

				switch (command.toLowerCase()) {

				case "prod_la":
					ProductOperations.listProducts();
					break;

				case "prod_get":
					ProductOperations.getProduct();
					break;

				case "prod_del":
					ProductOperations.deleteProduct();
					break;

				case "prod_upd":
					ProductOperations.updateProduct();
					break;

				case "prod_add":
					ProductOperations.addProduct();
					break;

				case "user_del":
					UserOperations.deleteUser();
					break;

				case "user_upd":
					UserOperations.updateUser();
					break;

				case "user_add":
					UserOperations.addUser();
					break;

				case "exit":
					// Nothing to do
					break;

				default:
					System.out.println("Invalid Command.");
					break;
				}
			} else {
				System.out.println("Must login to perform this action");
			}
		}

	}
}
