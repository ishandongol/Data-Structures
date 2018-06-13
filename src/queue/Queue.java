package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> implements QueueInterface<T> {
	int front = 0;
	int back = -1;
	List<T> list;

	public Queue() {
		list = new ArrayList<>();
	}

	@Override
	public void enqueue(T item) {
		if (list.add(item)) {
			back++;
		}
	}

	@Override
	public T dequeue() {

		if (!isEmpty()) {
			T item = list.remove(front);
			back--;
			return item;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if (front > back) {
			front = 0;
			back = -1;
			return true;
		}
		return false;
	}

	@Override
	public T peak() {
		return list.get(front);
	}

}
