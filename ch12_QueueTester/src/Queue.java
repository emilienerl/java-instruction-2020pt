import java.util.LinkedList;

public class Queue<E> {
	// E is a placeholder for whenever someone uses it. Where ever you see the E you
	// are replacing it with a string
	private LinkedList<E> list = new LinkedList<>();

	public void push(E item) {
		list.addLast(item);
	}

	public E pull() {
		return list.removeFirst();
	}

	public int size() {
		return list.size();
	}
}