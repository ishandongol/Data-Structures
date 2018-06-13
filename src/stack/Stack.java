package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> implements StackInterface<T> {
	private int top = -1;
	private List<T> list = new ArrayList<T>();

	@Override
	public void push(T item) {
		if (list.add(item)) {
			top++;
		}
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T item = list.remove(top);
			top--;
			return item;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return ((top == -1) ? true : false);
	}

	@Override
	public T peak() {
		return list.get(top);
	}

	public int getSize() {
		return list.size();
	}

}
