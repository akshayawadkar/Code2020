import java.util.*;

class _19_PascalsTriangle {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(n == 0){
            return result;
        }
        
        List<Integer> r1 = new ArrayList<>(Arrays.asList(1));
        result.add(new ArrayList<>(r1));
        if(n == 1){
            return result;
        }
        List<Integer> r2 = new ArrayList<>(Arrays.asList(1, 1));
        result.add(new ArrayList<>(r2));
        if(n == 2){
            return result;
        }
        
        System.out.println(result);
        for(int i = 2; i < n; i++){
            
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                curr.add(1);
            }
            
            List<Integer> prev = result.get(i - 1);
            
            for(int j = 1; j < i; j++){
                curr.set(j, prev.get(j - 1) + prev.get(j));
            }
            
            result.add(new ArrayList<>(curr));
            
        }
        
        
        return result; 
    }
}