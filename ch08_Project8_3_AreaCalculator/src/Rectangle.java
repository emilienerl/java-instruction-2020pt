public class Rectangle extends Square {

	// instant variables
	private double height;

	// constructors
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// overrides
	// override and give it an implementation
	@Override
	public double getArea() {
		return this.getWidth() * height;
	}
}
