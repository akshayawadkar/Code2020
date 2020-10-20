
public class _12_FindTheIndexOfZeroToBeReplacedToGetMaxLengthContinoiusOnes {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
		solve(arr);
	}

	private static void solve(int[] arr) {

		int maxLen = 0;
		int left = 0, right = 0;
		int k = 1;
		int idx = 0;

		while (right < arr.length) {
			if (arr[right] == 0) {
				k--;
			}

			while (k < 0) {
				if (arr[left] == 0) {
					k++;
				}
				idx = right;
				left++;
			}

			if (maxLen < right - left + 1) {

				maxLen = right - left + 1;

			}
			right++;
		}

		System.out.println(idx + " " + maxLen);
	}
}
