import java.util.Scanner;

public class Solution {
	public static String[] descryptSpell(String[] str) {

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asoSCioCsocijdjfi";

		String[] arrayword;

		arrayword = str.split("");

		for (int i = 2; i < arrayword.length; i += 3) {
			if (arrayword[i].compareTo("a") > 0 && arrayword[i].compareTo("z") < 0)
				arrayword[i].toUpperCase();
			else
				arrayword[i] = "!";
			for (int j = 0; j < arrayword.length; j++) {
				System.out.print(arrayword[j]);
			}
		}
	}

}
