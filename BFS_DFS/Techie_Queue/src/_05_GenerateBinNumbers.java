import java.util.LinkedList;

public class _05_GenerateBinNumbers {
	
	public static void main(String[] args) {
		
		LinkedList<String> q = new LinkedList<String>();
		
		q.add("1");
		
		int n = 10;
		int i = 1;
		while(i <= n) {
			q.add(q.peek() + '0');
			q.add(q.peek() + '1'); 
			System.out.println(q.poll());
			i++;
		}
		
		 
	}

}
