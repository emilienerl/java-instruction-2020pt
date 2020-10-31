package prs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Product;
import prs.exception.PrsDataException;

public class ProductDb {

	public ProductDb() {

	}

	private Connection getConnection() throws SQLException {

		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<Product> getAll() {

		String selectAll = "SELECT * FROM  Product";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {

			List<Product> products = new ArrayList<>();

			while (rs.next()) {

				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorId");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photoPath = rs.getString("PhotoPath");

				Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);

				products.add(product);

			}

			return products;

		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving products. Msg: " + e.getMessage());
		}

	}

	public Product get(int Id) {
		String selectOne = "SELECT * FROM product WHERE ID = ?";
		Product product = null;
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(selectOne);) {
			ps.setInt(1, Id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorId");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photoPath = rs.getString("PhotoPath");

				product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);

			}

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);

		}
		return product;
	}

	public boolean delete(int id) {
		String productDelete = "DELETE FROM product WHERE ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productDelete);) {
			ps.setInt(1, id);

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}
	}

	public boolean update(Product product) {
		String productUpdate = "UPDATE product SET VendorID = ?, PartNumber = ?, Name = ?, Price = ?, Unit = ?, PhotoPath = ? WHERE ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productUpdate)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}

	}

	public boolean add(Product product) {
		String productInsert = "INSERT INTO product(VendorId, PartNumber, Name, Price, Unit, PhotoPath) VALUES (?,?, ?, ?, ?, ?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productInsert)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}
}
