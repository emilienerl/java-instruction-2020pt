import java.util.ArrayList;
import java.util.List;

public class WizardInventoryApp {

	private static final int MAX_INVENTORY_SIZE = 4;

	public static void main(String[] args) {

		printWelcomeMessage();

		List<String> inventory = new ArrayList<>();
		inventory.add("pointy hat");
		inventory.add("magic wand");
		inventory.add("black cat");

		String command = "go";
		while (!command.equalsIgnoreCase("exit")) {

			System.out.println();
			switch (command.toLowerCase()) {
			case "show":
				showInventory(inventory);
				break;

			case "grab":
				addItemToInventory(inventory);
				break;

			case "edit":
				editInventory(inventory);
				break;

			case "drop":
				dropItemFromInventory(inventory);
				break;

			case "exit":
				System.out.println("Bye!");
				break;

			default:
				System.out.println("Invalid Command");
				break;

			}

		}
	}

	private static void printWelcomeMessage() {
		System.out.println("The Wizard Inventory Game");
		System.out.println("Command Menu: ");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an items");
		System.out.println("edit - Edit an items");
		System.out.println("drop - Drop an items");
		System.out.println("exit - Exit program");

	}

	private static void showInventory(List<String> inventory) {

		for (String item : inventory) {
			System.out.println((inventory.indexOf(item) + 1) + "." + item);
		}
	}

	private static void addItemToInventory(List<String> inventory) {
		if (inventory.size() >= MAX_INVENTORY_SIZE) {
			System.out.println("You can't carry any more items. Drop something first.");
			return;
		}

		String newItem = Console.getString("Name: ");
		inventory.add(newItem);
		System.out.println(newItem + " was added.");
	}

	private static void editInventory(List<String> inventory) {
		int oneBasedIndex = Console.getInt("Number: ");
		int zeroBasedIndex = oneBasedIndex - 1;

		if (zeroBasedIndex < 0 || zeroBasedIndex >= inventory.size()) {
			System.out.println("Index invalid");
			return;
		}

		String newItemName = Console.getString("Updated name: ");
		String previousItemName = inventory.set(zeroBasedIndex, newItemName);
		System.out.println("Replaced " + previousItemName + " with " + newItemName);
	}

	private static void dropItemFromInventory(List<String> inventory) {
		int oneBasedIndex = Console.getInt("Number: ");
		int zeroBasedIndex = oneBasedIndex - 1;

		if (zeroBasedIndex < 0 || zeroBasedIndex >= inventory.size()) {
			System.out.println("Index invalid");
			return;
		}

		String removedItem = inventory.remove(zeroBasedIndex);
		System.out.println(removedItem + " was removed.");
	}

}
