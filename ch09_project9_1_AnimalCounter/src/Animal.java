
public abstract class Animal implements Countable {
	// you cannot use the word "new" with this class since it is abstract

	private int count;

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

}
