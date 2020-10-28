import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _24_LargestNumPossible {
	
	public static void main(String[] args) {

		List<String> ip = new ArrayList<>(Arrays.asList("10", "68", "97", "9", "21", "12"));
		
		System.out.println(ip);
		ip.sort((a, b) ->{return (a + b).compareTo(b + a);});
		
		System.out.println(ip);
		
	}

}
