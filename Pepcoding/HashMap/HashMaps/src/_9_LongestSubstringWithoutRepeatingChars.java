import java.util.*;
public class _9_LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        int maxL = 0;
        int i = 0, j = 0;
        
        while(j < s.length()){
           if(set.contains(s.charAt(j))){
               set.remove(s.charAt(i));
               i++;
           }else{
               set.add(s.charAt(j));
               maxL = Math.max(maxL, set.size());
               j++;
           }
        }
        
        return maxL; 
    }
}