package _02_2Pointers;

public class _01 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6 };
		int target = 6;

		solve(arr, target);
		solve2(arr, target);

	}

	private static void solve2(int[] arr, int target) { 
		
		
	}

	private static void solve(int[] arr, int target) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int sum = arr[left] + arr[right];

			if (sum == target) {
				System.out.println(left + "  " + right);
				break;
			}

			if (sum > target) {
				right--;
			} else if (sum < target) {
				left++;
			}

		}

	}
}
