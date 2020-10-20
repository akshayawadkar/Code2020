
public class Test {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 17, 20, 16, 18, 22, 20, 22, 20, 23, 25 };
		int fee = 3;
		solve(arr, fee);
	}

	private static void solve(int[] arr, int fee) {

		 int obsp = -arr[0];
		 int ossp = 0;
		 
		 for(int i = 1; i < arr.length; i++) {
			 int nbsp = 0;
			 int nssp = 0;
			 
			 if(ossp - arr[i] > obsp) {
				 nbsp = ossp - arr[i];
			 }else {
				 nbsp = obsp;
			 }
			 
			 if(arr[i] + obsp - fee > ossp) {
				 nssp = arr[i] + obsp - fee;
			 }else {
				 nssp = ossp;
			 }
			 
			 
			 obsp = nbsp;
			 ossp = nssp;
			 
		 }
		 
		 System.out.println(ossp);
	}
}

/*
 * int bsp = -arr[0]; int ssp = 0;
 * 
 * for(int i = 1; i < arr.length; i++) { int nbsp = 0; int nssp = 0;
 * 
 * if(ssp - arr[i] > bsp) { nbsp = ssp - arr[i]; }else { nbsp = bsp; }
 * 
 * if(bsp + arr[i] - fee > ssp) { nssp = bsp + arr[i] - fee; }else { nssp = ssp;
 * }
 * 
 * bsp = nbsp; ssp = nssp; }
 * 
 * System.out.println(ssp);
 */
