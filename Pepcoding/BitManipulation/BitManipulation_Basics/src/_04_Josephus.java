

// Count the number of On Bits;
public class _04_Josephus {
	
	public static void main(String[] args) {
		
		int num = 76;
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num));
		
		int counter = 0;
		
		while(num != 0) {
			int rsbm = num & (-num);
			num = num - rsbm;
			counter++;
		}
		
		System.out.println(counter);
	}

}
