import java.util.Arrays;

public class _11_Merge2SortedArrays_Leetcode88 {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		
		solve(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));

	}

	private static void solve(int[] nums1, int m, int[] nums2, int n) {
		 
		int lstIndex = m + n - 1;
		
		--m;
		--n;
		
		while(m >= 0 && n >= 0) {
			if(nums1[m] > nums2[n]) {
				nums1[lstIndex--] = nums1[m--];
			}else {
				nums1[lstIndex--] = nums2[n--];
			}
		}
		
	}

}
