package prs.crud;

import java.util.List;
import prs.business.Product;
import prs.database.ProductDb;
import prs.ui.Console;

public class ProductOperations {
	ProductDb product = new ProductDb();

	public static void listProducts() {
		ProductDb productDb = new ProductDb();
		List<Product> products = productDb.getAll();
		System.out.println("Products: ");
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

	public static void deleteProduct() {
		ProductDb product = new ProductDb();
		int deleteId = Console.getInt("Product Id to delete");
		if (product.delete(deleteId)) {
			System.out.print("Product deleted successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void updateProduct() {
		ProductDb product = new ProductDb();
		int productId = Console.getInt("Product ID to update: ");
		int vendorId = Console.getInt("Vendor ID to update: ");
		String partNumber = Console.getString("PartNumber to update: ");
		String name = Console.getString("Name to update: ");
		Double price = Console.getDouble("Price to update: ");
		String unit = Console.getString("Unit to updat: ");
		String photoPath = Console.getString("PhotoPath to update: ");
		Product productUpdate = new Product(productId, vendorId, partNumber, name, price, unit, photoPath);
		if (product.update(productUpdate)) {
			System.out.print("Product updated successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void addProduct() {
		ProductDb product = new ProductDb();
		int vendorId = Console.getInt("VendorId to add: ");
		String partNumber = Console.getString("PartNumber to add: ");
		String name = Console.getString("Name to add: ");
		Double price = Console.getDouble("Price to add: ");
		String unit = Console.getString("Unit to add: ");
		String photoPath = Console.getString("PhotoPath to add: ");
		Product productAdd = new Product(0, vendorId, partNumber, name, price, unit, photoPath);
		if (product.add(productAdd)) {
			System.out.print("Product added successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void getProduct() {
		ProductDb product = new ProductDb();
		int productId = Console.getInt("Product ID: ");
		System.out.println("Product: " + product);
	}
}
