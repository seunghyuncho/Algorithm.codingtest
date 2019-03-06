import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sortion {
	static int[] arr;
	static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr = new int[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		str = Arrays.toString(arr);

		str = str.replace("[", "");
		str = str.replace("]", "");

		StringTokenizer st = new StringTokenizer(str," ,");
		String[] str1 = new String[st.countTokens()];

		int cnt = 0;
		while (st.hasMoreTokens()) {
			str1[cnt++] = st.nextToken();
		}
//		
//		if(str1[0].compareTo(str1[1]) > 0) {
//			
//		}
		System.out.println(str1[0].compareTo(str1[1]));
		System.out.println(str1[0].compareTo(str1[2]));
		

	}

}
