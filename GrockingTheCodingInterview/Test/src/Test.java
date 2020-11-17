import java.io.File;

public class Test {
	public static void main(String[] args) {
		try {

			File f = new File("/Test/JSONTests/createSingleOrderRequest.json");

			System.out.println(f.exists());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
