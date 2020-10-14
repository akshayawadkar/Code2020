
public class _02_RightMostSetBitMask {

	
	public static void main(String[] args) {
		
		String ip = "11101000";
		int num = Integer.parseInt(ip, 2);
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num));
		
		
		int result  = num & (-num);
		
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));
		
	}
}

/*
11101000
00010111
	  +1
--------
00011000


11101000
&00011000
	________
	00001000
*/ 

