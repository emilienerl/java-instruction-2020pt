public interface ProductReader {
	Product get(String code);

	String getAll();
}
//get method that returns a string of a product
//these two methods are avail. in ProductDB