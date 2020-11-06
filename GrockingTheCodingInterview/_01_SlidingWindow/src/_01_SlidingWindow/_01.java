package _01_SlidingWindow;

import java.util.Arrays;

//Sliding Window Average

public class _01 {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		int k = 5;

		solve2(arr, k);
	}

	private static void solve2(int[] arr, int k) {
		 
		int sum = 0;
		for(int left = 0, right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			if(right >= k - 1) {
				System.out.println((float)sum / k);
				sum -= arr[left];
				left++;
			}
		}
		
	}

	private static void solve(int[] arr, int k) {

		int sum = 0;
		for (int left = 0, right = 0; right < arr.length; right++) {

			sum += arr[right];

			while (right - left + 1 > k) {
				sum -= arr[left];
				left++;

			}

			if (right - left + 1 == k) {
				System.out.println((float) sum / k);
			}

		}

	}

}
