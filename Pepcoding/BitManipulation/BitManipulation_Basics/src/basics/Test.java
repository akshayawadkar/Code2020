package basics;

public class Test {

	public static void main(String[] args) {
		
		String ip = "10110";
		int num = Integer.parseInt(ip, 2);
		
		System.out.println(ip);
		System.out.println(num);
		 
		
		int mask = 1 << 1;
		
		num = num & mask;
		
		
		System.out.println(num != 0);
	}
	
}
