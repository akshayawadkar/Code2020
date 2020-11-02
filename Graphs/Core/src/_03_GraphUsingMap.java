import java.util.*;

public class _03_GraphUsingMap {

	public static void main(String[] args) {

		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 3 }};

		solve(edges);

	}

	private static void solve(int[][] edges) {

		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int[] edge : edges) {
			int src = edge[0];
			int dest = edge[1];

			map.putIfAbsent(src, new ArrayList<>());
			map.putIfAbsent(dest, new ArrayList<>());
			
			map.get(src).add(dest);
			
			 
		}
		
		System.out.println(map);
		
		bfs(map, 2);
		System.out.println();
		dfs(map, 2);
		
		 
	}

	private static void dfs(Map<Integer, List<Integer>> map, int start) {
		 
		int n = map.size();
		boolean[] visited = new boolean[n];
		
		dfs_helper(visited, start, map);
		
		
	}

	private static void dfs_helper(boolean[] visited, int start, Map<Integer, List<Integer>> map) {
		if(visited[start]) {
			return;
		}
		
		visited[start] = true;
		System.out.print(start+" ");
		
		for(Integer child : map.get(start)) {
			if(!visited[child]) {
				dfs_helper(visited, child, map);
			}
		}
		
	}

	private static void bfs(Map<Integer, List<Integer>> map, int start) {
		 
		int n = map.size();
		LinkedList<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[n];
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				Integer curr = q.poll();
				System.out.print(curr+" ");
				
				for(Integer child : map.get(curr)) {
					if(!visited[child]) {
						q.add(child);
						visited[child] = true;
					}
				}
			}
		}
		
	}
}
