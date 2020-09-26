public class Square extends Shape {

	// instant variables
	private double width;

	// constructors
	public Square(double width) {
		this.width = width;
	}

	// getters and setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// overrides
	// override and give it an implementation
	@Override
	public double getArea() {
		return width * width;
	}
}
