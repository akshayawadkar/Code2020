package PandC;

import java.util.*;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer> subList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        solve(n, 1, k, subList, result);
        
        return result;
    }
    
    private void solve(int n, int curr, int k, List<Integer> subList, List<List<Integer>> result){
        
        if(k > n){
            return;
        }
        
        if(k == 0){
            result.add(new ArrayList<>(subList));
            return;
        }
        
        for(int i = curr; i <= n; i++){
            subList.add(i);
            solve(n, i + 1, k - 1, subList, result);
            subList.remove(subList.size() - 1);
        }
    }
    
}