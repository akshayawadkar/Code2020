
public class _16_BoyerMoore {

	public static void main(String[] args) {

//		int[] arr = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
		int[] arr = { 2, 3, 4, 3, 3 };

		solve(arr);

	}

	private static void solve(int[] arr) {

		int m = -1;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (cnt == 0) {
				m = arr[i];
				cnt = 1;
			} else if (m == arr[i]) {
				cnt++;
			} else {
				cnt--;
			}
		}

		System.out.println(m);
	}

}
