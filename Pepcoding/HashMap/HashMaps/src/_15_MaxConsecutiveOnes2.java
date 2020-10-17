public class _15_MaxConsecutiveOnes2 {
    public int longestOnes(int[] A, int K) {
        
        int left = 0, right = 0;
        int max = 0;
        
        while(right < A.length){
            
            if(A[right] == 0){
                K--;
            }
            
            while(K < 0){
                if(A[left] == 0){
                    K++;
                }
                left++;
            }
            
            max = Math.max(max, right - left + 1);
            right++;
        }
        
        return max;
    }
}