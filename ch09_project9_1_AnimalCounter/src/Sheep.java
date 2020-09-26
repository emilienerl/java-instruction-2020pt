
public class Sheep extends Animal implements Cloneable {

	// fields
	String name;

	// constructor
	public Sheep() {
		name = "";
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Overrides
	@Override
	public String getCountString() {

		return getCount() + " " + name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
