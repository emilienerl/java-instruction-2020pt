
public class Circle extends Shape {
	// circle extends shape, and circle needs to inherit the getArea
	// circle is a shape

	// instant variables
	private double radius;

	// constructors
	public Circle(double radius) {
		this.radius = radius;
	}

	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// overrides
	// override and give it an implementation
	@Override
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
