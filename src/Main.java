import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import binarySearch.BinarySearch;
import queue.Queue;
import stack.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("Select a number");
		System.out.println("0 . Stack Implementation");
		System.out.println("1 . Queue Implementation");
		System.out.println("2 . Binary Search");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 0:
			Stack<String> stack = new Stack<>();
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

			break;
		case 1:
			Queue<String> queue = new Queue<>();
			for (int i = 0; i < 5; i++) {
				queue.enqueue(sc.nextLine());

			}
			sc.close();

			System.out.println("Dequeue Operation");
			for (int i = 0; i < 5; i++) {
				System.out.println(queue.dequeue());
			}
			if (queue.isEmpty()) {
				System.out.println("Empty");
			}
			break;
		case 2:
			Random random = new Random();
			List<Integer> randomNumbers = new ArrayList<>();
			for (int i = 0; i < 100; i++) {
				randomNumbers.add(random.nextInt(100));
			}

			int item = 50;
			BinarySearch binarySearch = new BinarySearch(randomNumbers);
			if (binarySearch.search(item)) {
				System.out.println("Found " + item + " at " + binarySearch.getIndex());

			} else {
				System.out.println(item + " Not Found");
			}
			break;
		default:
			System.out.println("Error");
			break;

		}
		sc.close();

	}

}
