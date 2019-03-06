import java.util.Scanner;

public class Find13 {
	static String str;
	static int cnt = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			str = Integer.toString(i);
			if (str.indexOf("13") == -1) {
				continue;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
