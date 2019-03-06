
// 배열 입력 받아서 한 칸씩 오른쪽으로 시프트하는 알고리즘을 구하라(맨 끝에 있는 값은 맨 앞으로 와야함.)

import java.util.Scanner;

public class iteratoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print("입력 받을 숫자값을 입력하세요 : ");
		int n = kb.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + "번 째 숫자값 : ");
			data[i] = kb.nextInt();
		}
		kb.close();

		int tmp = data[n - 1]; // data[4]
		for (int i = n - 2; i >= 0; i--) // 3 2 1 0
			data[i + 1] = data[i]; // data[4] = data[3] data[3] = data[2] data[2] = data[1] data[1] = data[0]
		data[0] = tmp;

		for (int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}

}
