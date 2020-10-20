package _Topic_3_CountSubseq;

public class _PaintHouse_1 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 5, 7 },
						{ 5, 8, 4 },
						{ 3, 2, 9 },
						{ 1, 2, 4 } };

		int minCost = solve(arr);
		System.out.println(minCost);

	}

	private static int solve(int[][] arr) {

		int or = arr[0][0], ob = arr[0][1], og = arr[0][2];

		for (int i = 1; i < arr.length; i++) {
			int nr = arr[i][0] + Math.min(ob, og);
			int nb = arr[i][1] + Math.min(or, og);
			int ng = arr[i][2] + Math.min(or, ob);
			
			or = nr;
			ob = nb;
			og = ng;
			
		}

		return Math.min(or, Math.min(ob, og));
	}
}
