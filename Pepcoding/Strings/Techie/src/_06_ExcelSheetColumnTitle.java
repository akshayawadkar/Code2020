
public class _06_ExcelSheetColumnTitle {

	public String convertToTitle(int n) {

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			char ch = (char) ('A' + ((n - 1) % 26));
			sb.append(ch);
			n = (n - 1) / 26;
		}

		return sb.reverse().toString();
	}

	public static void main(String[] args) {

		System.out.println((char) ('A' + ((1 - 1) % 26)));
	}

}
