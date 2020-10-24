import java.util.*;

public class _GreyCode {

	public static void main(String[] args) {

		int n = 2;
		List<String> list = solve(n);
		System.out.println(list);

	}

	private static List<String> solve(int n) {

		if (n == 1) {
			return new ArrayList<>(Arrays.asList("0", "1"));
		}

		List<String> subList = solve(n - 1);
		List<String> result = new ArrayList<>();

		for (int i = 0; i < subList.size(); i++) {
			result.add(0 + subList.get(i));
		}

		for (int i = subList.size() - 1; i >= 0; i--) {
			result.add(1 + subList.get(i));
		}

		return result;
	}
}
