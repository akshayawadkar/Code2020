import java.util.Stack;

public class _16_LongestValidParenthesis {

	public int longestValidParentheses(String s) {
		if (s.length() == 0) {
			return 0;
		}

		int max = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				stack.pop();

				// this is to when our ip is starting with closing bracket
				// eg: ")()())"
				if (stack.isEmpty()) {
					stack.push(i);
				}
				max = Math.max(max, i - stack.peek());
			}
		}

		return max;
	}

}
