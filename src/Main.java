import java.util.Scanner;

import stack.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
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

	}

}
