import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int first = 0;
		int second = 0;
		int value = 0;
		int valuetwo = 0;
		int result = 0;
		

		for (;;) {
			first++;
			second++;
			value = (int) Math.pow(first, 2);
			valuetwo = (int) Math.pow(second, 2);
			if (value - valuetwo == n) {
				result++;
			}
			if (first > 100000 && second > 100000) {
				break;
			}
		}
		System.out.println(result);
		sc.close();

	}

}