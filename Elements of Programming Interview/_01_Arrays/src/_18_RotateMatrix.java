import java.util.Arrays;
import java.util.Collections;

public class _18_RotateMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 },
						{ 4, 5, 6 },
						{ 7, 8, 9 } };
		
		Collections.reverse(Arrays.asList(arr));
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
						
			}
		}
		
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
