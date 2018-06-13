import java.util.Scanner;

import queue.Queue;
import stack.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new Queue<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			stack.push(sc.nextLine());

		}
		System.out.println("Pop Operation");
		for (int i = 0; i < 5; i++) {
			System.out.println(stack.pop());
		}
		if (stack.isEmpty()) {
			System.out.print("Empty Stack");

		}

		Scanner sce = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			queue.enqueue(sce.nextLine());

		}

		System.out.println("Dequeue Operation");
		for (int i = 0; i < 5; i++) {
			System.out.println(queue.dequeue());
		}
		if (queue.isEmpty()) {
			System.out.println("Empty");
		}

	}

}
