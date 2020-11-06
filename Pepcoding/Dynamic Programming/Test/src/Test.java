public class Test {
	public static void main(String[] args) {
		
		String[] result = new String[4];
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			
			int hash = ch % 4;
			
			if(result[hash] == null) {
				result[hash] = String.valueOf(ch);
			}else {
				result[hash] += ch;
			}
		} 
		
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}