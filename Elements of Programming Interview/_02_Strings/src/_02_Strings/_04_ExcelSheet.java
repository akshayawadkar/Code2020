package _02_Strings;

public class _04_ExcelSheet {

	public int titleToNumber(String s) {

		int num = 0;
		int pow = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			num += (int) (s.charAt(i) - 'A' + 1) * (int) Math.pow(26, pow++);
		}

		return num;

	}
}

/*
 * 
 * Understanding the logic is more imp than the solution: A = 26 AA = 27 AB = 28
 * 
 * A A 1 * (26 ^ 1) + 1 * (26 ^ 0); 26 + 1 = 27
 * 
 * 
 * A B 1 * (26 ^ 1) + 2 * (26 ^ 0); 26 + 2 = 28
 * 
 * 
 * Z Y 26 * (26 ^ 1) + 25 * (26 ^ 0); 676 + 25 = 701
 * 
 * 
 */
