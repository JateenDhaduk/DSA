class Solution {
    public void moveZeroes(int[] nums) {
        int left = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                left = i;
                break;
            }
        }
        if(left == -1){
            return;
        }
        for(int right = left + 1; right<n; right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}