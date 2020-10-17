
public class _11_NextPermuatation {

	 public void nextPermutation(int[] nums) {
	        
	        int i = nums.length - 2;
	        while(i >= 0){
	            if(nums[i] < nums[i + 1]){
	                break;
	            }
	            i--;
	        }
	        
	        if(i == -1){
	            reverse(nums, 0, nums.length - 1);
	            return;
	        }
	        
	        int k = nums.length - 1;
	        while(k > i){
	            if(nums[k] > nums[i]){
	                break;
	            }
	            k--;
	        }
	        
	        swap(nums, i, k);
	        
	        reverse(nums, i + 1, nums.length - 1);
	        
	      
	        
	        
	    }
	    
	    private void reverse(int[] arr, int left, int right){
	        while(left <= right){
	            int tmp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = tmp;
	            left++;
	            right--;
	        }
	    }
	    
	    private void swap(int[] arr, int left, int right){
	        int tmp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = tmp;
	    }
}
