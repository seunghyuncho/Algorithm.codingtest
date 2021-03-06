package tsys.codingtest;

public class Recursion {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(sequentialSort(arr, 0, 7));
	}

	public static int sequentialSort(int arr[], int begin, int target) {
		if (begin > arr.length - 1) {
			return -1;
		} else if (arr[begin] == target) {
			return begin;
		} else {
			return sequentialSort(arr, begin + 1, target);
		}
	}

}
