import java.util.Arrays;

public class _14_ArrangeAlternativeHighLow {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] result = solve(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] solve(int[] arr) {

		int[] result = new int[arr.length];

		int i = 0, j = arr.length - 1;
		boolean flag = true;
		int curr = 0;

		while (curr < arr.length) {
			if(flag) {
				result[curr++] = arr[i++];
				flag = false;
			}else {
				result[curr++] = arr[j--];
				flag = true;
			}
		}

			return result;
	}

}
