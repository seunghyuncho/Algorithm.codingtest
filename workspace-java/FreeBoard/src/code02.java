import java.util.Scanner;

// hashing

public class code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String arr[] = num.split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int value = 0;

		int first = 0;
		int result = 0;

		for (;;) {
			first++;
			value = (int) Math.pow(first, 2);
			if (value >= a && value <= b) {
				result++;

			}
			if (value > b) {
				break;
			}
		}
		System.out.println(result);
		sc.close();

	}

}
