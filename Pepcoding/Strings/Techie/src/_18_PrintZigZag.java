
public class _18_PrintZigZag {

	public static void main(String[] args) {
		String ip = "PAYPALISHIRING";
		String result = solve(ip, 3);
		System.out.println(result);
	}

	private static String solve(String s, int numRows) {

		String[] result = new String[numRows];
		int idx = 0;
		boolean flag = true;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(result[idx] == null) {
				result[idx] = String.valueOf(s.charAt(i));
			}else {
				result[idx] = result[idx] + s.charAt(i);
			}
			
			if(flag) {
				idx++;
			}else {
				idx--;
			}
			
			if(idx == numRows) {
				idx = idx - 2;
				flag = false;
			}else if(idx == -1){
				idx = idx + 2;
				flag = true;
			}
			
		}
		
		String res = "";
		for(String r : result) {
			res += r;
		}
		return res;
	}
}
