import java.util.HashMap;
import java.util.Map;

public class _3_EqualArrayPairsDivByK{
	
	public static void main(String[] args) {
		
		int[] arr = {9, 56, 25, 52, 72, 44, 80, 36, 96, 71, 55, 60};
		int k = 8;
		
		for(int i : arr) {
			System.out.println(i + " " + (i % k));
		}
//		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {
	 
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			int rem = i % k;
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}
		
		System.out.println(map);
		
		for(int i : arr) {
			int rem = i % k;
			
			if(rem == 0) {
				int fq = map.get(rem);
				if(fq % 2 == 1) {
					System.out.println(false);
					return;
				}
			}else if(2 * rem == k) {
				int fq = map.get(rem);
				if(fq % 2 == 1) {
					System.out.println(false);
					return;
				}
			}else {
			
				int fq1 = map.get(rem); 
				int fq2 = map.get(k - rem);
				if(fq1 != fq2) {
					System.out.println(false);
					return;
				}
			}
		}
		
		System.out.println(true);
		
	}

}

/* 	Input: 	int[] arr = {9, 56, 25, 52, 72, 44, 80, 36, 96, 71, 55, 60};
			int k = 8;
			
 * 	Frequency map: {0=4, 1=2, 4=4, 7=2}
 
 	
 * 	There are 3 conditions to check:
 * 	1) if freq(x) ==  freq(k - x);
 * 	2) freq(0) should be even;
 * 	3) freq(k / 2) should be even; 
 * 
 * */



