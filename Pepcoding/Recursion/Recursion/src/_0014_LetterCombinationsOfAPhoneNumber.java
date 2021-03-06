import java.util.*;

public class _0014_LetterCombinationsOfAPhoneNumber{
    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        solve(digits, 0, "", result);
        return result;
    }
    private void solve(String digits, int idx, String curr, List<String> result){
        
        if(digits.length() == idx){
            result.add(curr);
            return;
        }
        
        char[] arr = map[digits.charAt(idx) - '0'].toCharArray();
        
        for(int i = 0; i < arr.length; i++){
             solve(digits, idx + 1, curr + arr[i], result);
        }
        
    }
}