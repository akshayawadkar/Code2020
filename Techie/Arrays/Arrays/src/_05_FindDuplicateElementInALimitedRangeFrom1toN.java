class _05_FindDuplicateElementInALimitedRangeFrom1toN
{
	// Function to find a duplicate element in a limited range array
	public static int findDuplicate(int[] A)
	{
		int xor = 0;

		// take xor of all array elements
		for (int value : A) {
			xor ^= value;
		}

		// take xor of numbers from 1 to n-1
		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}

		// same elements will cancel out each other as a ^ a = 0,
		// 0 ^ 0 = 0 and a ^ 0 = a

		// xor will contain the missing number
		return xor;
	}

	public static void main(String[] args)
	{
		// input array contains n numbers between [1 to n - 1]
		// with one duplicate, where n = A.length
		int[] A = { 1, 2, 3, 4, 4 };

		System.out.println("Duplicate element is " + findDuplicate(A));
	}
}