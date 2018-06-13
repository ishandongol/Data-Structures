package stack;

public interface StackInterface<T> {
	void push(T item);

	T pop();

	boolean isEmpty();

	T peak();

}
