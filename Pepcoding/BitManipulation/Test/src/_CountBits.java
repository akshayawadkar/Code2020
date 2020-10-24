
public class _CountBits {

	public static void main(String[] args) {

		String ip = "101010111";
		int num = Integer.parseInt(ip, 2);

		System.out.println(ip);
		System.out.println(num);

		int count = 0;

		while (num != 0) {
			int mask = num & (-num);
			num = num - mask;
			count++;
		}

		System.out.println(count);
	}

}
