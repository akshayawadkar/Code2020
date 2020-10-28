
public class _06_ExcelSheetColumnNumber {

	public int titleToNumber(String s) {

		int num = 0;
		int i = s.length() - 1;
		int power = 0;
		while (i >= 0) {
			num = num + (int) (s.charAt(i) - 'A' + 1) * (int) Math.pow(26, power++);
			i--;
		}
		return num;
	}

}
