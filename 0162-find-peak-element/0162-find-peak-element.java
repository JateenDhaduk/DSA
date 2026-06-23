class Solution {
    public int findPeakElement(int[] nums) {
       int high = nums.length - 1;
       int low = 0;
        int mid = low + (high - low)/2;

        while(low < high){
            
            if(nums[mid] < nums[mid+1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
            mid = low + (high - low)/2;
        }
        return low;
    }
}