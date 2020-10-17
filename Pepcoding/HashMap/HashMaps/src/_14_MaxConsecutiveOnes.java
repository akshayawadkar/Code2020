public class _14_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int left = 0, right = 0;
        int max = 0;
        
        while(right < nums.length){
            if(nums[right] == 0){
                left = right + 1;    
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        
        return max;
    }
}

/*
0 1 2 3 4 5
1,0,1,1,0,1

*/