package bmdb.ui;

import java.time.LocalDate;
import java.util.List;

import bmdb.business.Actor;
import bmdb_db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Bootcamp Movie Database!");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("la - List Actors");
		System.out.println("aa - Add Actor");
		System.out.println("gabn - Get an Actor by Last Name");
		System.out.println("gabi - Get Actor by ID");
		System.out.println("da - Delete Actor by ID");
		System.out.println("ua - Update actor");
		System.out.println("exit - Exit application");

		ActorDb actorDb = new ActorDb();

		String command = Console.getString("Enter command: ");
		while (!command.equalsIgnoreCase("exit")) {

			switch (command) {
			case "la":
				List<Actor> actors = actorDb.getAll();
				System.out.println("Actors: ");

				for (Actor actor : actors) {
					System.out.println(actor);
				}
				break;

			case "aa":
				String newFirstName = Console.getString("First name: ");
				String newLastName = Console.getString("Last name: ");
				String newGender = Console.getString("Gender: ");
				String newBirthDateStr = Console.getString("Birthdate (YYYY-MM-DD): ");
				LocalDate newBirthDate = LocalDate.parse(newBirthDateStr);

				Actor newActor = new Actor(0, newFirstName, newLastName, newGender, newBirthDate);

				if (actorDb.add(newActor)) {
					System.out.println("Actor added successfully");
				} else {
					System.out.println("Error adding actor");
				}
				break;

			case "gabn":
				String lastName = Console.getString("Actor's last name: ");
				Actor actor = actorDb.getActorByLastName(lastName);

				if (actor == null) {
					System.out.println("No actor found");
				} else {
					System.out.println(actor);
				}
				break;

			case "gabi":
				long id = Console.getInt("Actor's ID: ");
				Actor actorById = actorDb.get(id);

				if (actorById == null) {
					System.out.println("Actor not found");

				} else {
					System.out.println(actorById);
				}
				break;

			case "da":
				long idToDelete = Console.getInt("Actor ID to delete: ");

				if (actorDb.delete(idToDelete)) {
					System.out.println("Actor deleted");

				} else {
					System.out.println("Error deleting Actor");
				}
				break;

			case "ua":
				long updId = Console.getInt("ID: ");
				String updFirstName = Console.getString("First name: ");
				String updLastName = Console.getString("Last name: ");
				String updGender = Console.getString("Gender: ");
				String updBirthDateStr = Console.getString("Birthdate (YYYY-MM-DD): ");
				LocalDate updBirthDate = LocalDate.parse(updBirthDateStr);

				Actor updActor = new Actor(updId, updFirstName, updLastName, updGender, updBirthDate);

				if (actorDb.update(updActor)) {
					System.out.println("Actor updated successfully");
				} else {
					System.out.println("Error updating actor");
				}
				break;

			}

			command = Console.getString("Enter command: ");

		}

	}

}
