package queue;

public interface QueueInterface<T> {
	void enqueue(T item);

	T dequeue();

	boolean isEmpty();

	T peak();
}
