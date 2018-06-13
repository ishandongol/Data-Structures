package binarySearch;

import java.util.Collections;
import java.util.List;

public class BinarySearch {
	private int upperBound, lowerBound, mid;
	private List<Integer> array;

	public BinarySearch(List<Integer> array) {
		this.array = array;
		Collections.sort(this.array);
		for (int item : array) {
			System.out.print(item + " ");
		}
		System.out.println("");
		this.upperBound = array.size();
		this.lowerBound = 0;
	}

	private int getMid() {
		return lowerBound + ((upperBound - lowerBound) / 2);
	}

	public int getIndex() {
		return this.mid;
	}

	public boolean search(int item) {
		while (true) {
			if (this.lowerBound > this.upperBound) {
				return false;
			}
			this.mid = getMid();
			if (item < this.array.get(this.mid)) {
				this.upperBound = this.mid - 1;

			}
			if (item > this.array.get(this.mid)) {

				this.lowerBound = this.mid + 1;
			}
			if (item == this.array.get(this.mid)) {
				return true;
			}
		}

	}
}
