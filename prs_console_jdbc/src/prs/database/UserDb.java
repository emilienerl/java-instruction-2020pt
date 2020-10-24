package prs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.User;
import prs.exception.PrsDataException;

public class UserDb {

	public UserDb() {

	}

	private Connection getConnection() throws SQLException {

		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<User> getAll() {
		String selectAll = "SELECT * FROM User";

		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {

			List<User> users = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("UserName");
				String password = rs.getString("password");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");

				User user = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer,
						isAdmin);

				users.add(user);
			}

			return users;

		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving users. Msg: " + e.getMessage());
		}
	}

	public boolean delete(int id) {
		String userDelete = "DELETE FROM user WHERE ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userDelete);) {
			ps.setInt(1, id);

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}
	}

	public boolean update(User user) {
		String userUpdate = "UPDATE user SET UserName = ?, Password = ?, FirstName = ?, LastName = ?, PhoneNumber = ?, Email = ?, isReviewer = ?, isAdmin = ? WHERE ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userUpdate)) {
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPhoneNumber());
			ps.setString(6, user.getEmail());
			ps.setBoolean(6, user.isReviewer());
			ps.setBoolean(7, user.isAdmin());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}

	}

	public boolean add(User user) {
		String userInsert = "INSERT INTO user(UserName, Password, FirstName, LastName, PhoneNumber, Email, isReviewer, isAdmin) VALUES (?,?, ?, ?, ?, ?,?,?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userInsert)) {
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPhoneNumber());
			ps.setString(6, user.getEmail());
			ps.setBoolean(6, user.isReviewer());
			ps.setBoolean(7, user.isAdmin());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}
}
