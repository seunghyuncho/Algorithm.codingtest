import java.util.Arrays;
import java.util.StringTokenizer;

public class Sortion1 {
	static int[] arr = new int[3];
	static int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr[0] = 15;
		arr[1] = 143;
		arr[2] = 167;
		
		String str = Arrays.toString(arr);
		str = str.replace("[", "");
		str = str.replace("]", "");

		StringTokenizer st = new StringTokenizer(str," ,");
		String[] str1 = new String[st.countTokens()];

		int cnt = 0;
		while (st.hasMoreTokens()) {
			str1[cnt++] = st.nextToken();
		}
		
		Arrays.sort(str1);
		
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
		arr = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
		

	}

}
