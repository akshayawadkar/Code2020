package _02_Strings;

public class Test {

	public static void main(String[] args) {

		int num = 27;
		String result = "";
		
		while (num > 0) {
			char ch = (char) ('A' + (num - 1) % 26);
			result += ch;
			num = (num - 1) / 26;
		}

		System.out.println(result);

	}

}
