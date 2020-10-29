import java.util.Arrays;

public class _17_InplaceRemovalOfABC {

	public static void main(String[] args) {

		String ip = "CBAABCAB";
		solve(ip.toCharArray());

	}

	private static void solve(char[] arr) {

		int writeIndex = 0;

		int i = 0;
		while (i < arr.length) {

			if (arr[i] == 'C') {
//				System.out.println("here");
				i++;
				continue;
			} else if (i != arr.length - 1 && arr[i] == 'A' && arr[i + 1] == 'B') {
				i = i + 2;
				continue;
			} else {
				arr[writeIndex++] = arr[i];
			}
			i++;
		}

		System.out.println(writeIndex);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, writeIndex)));
		
	}

}
