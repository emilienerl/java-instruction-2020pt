import java.text.NumberFormat;

//Rectangle class

public class Rectangle {

	// fields (aka instant variables or member variables)
	// values within the class
	// instant variables have the blue colored text

	private double length;
	private double width;

	private static int instanceCount = 0;
	// static is shared, anything declared static is called in the entire class
	// any new rectangle instant shares this count

	// constructor - uses just the class name
	// want our user to construct a new rectangle
	// return a new instance of the class they are constructing

	public Rectangle() {
		this(0, 0);
		// length = 0;
		// width = 0;
	}

	// same method with signatures of double
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;

		instanceCount++;
	}

	// setters and getters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Helper Methods (aka other methods)
	// length and width is called in getAreaFormated with this.getArea
	public double getArea() {
		return length * width;
	}

	// no params because we have the L and W with us
	// scope method being used below so once you get to the end curly it's over

	public String getAreaFormatted() {
		// System.err.println("In getAreaFormatted");
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		return number.format(this.getArea());
	}

	// this is a shared method for the whole class
	public static int getInstanceCount() {
		return instanceCount;
	}
}
