import java.util.Random;

public class _13_ShuffleAnArray {

    int[] clone;
    int[] nums;
    public _13_ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.clone = nums.clone();
        
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n = clone.length;
        Random rnd = new Random();
        for(int i = 0; i < n; i++){
            int j = rnd.nextInt(n - i);
            swap(clone, i, j);
        }
        return clone;
    }
    
    private void swap(int[] arr, int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */