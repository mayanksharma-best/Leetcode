class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cur = 0;
        int low = 0;
        int high = n-1;
        while(cur<=high){
            if(nums[cur] ==0){
               swap(nums,cur,low);
                cur++;
                low++;
            }
            else if(nums[cur]==1){
                cur++;
            }
            else if (nums[cur]==2){
               swap(nums,cur,high);
                high--;
            }

        }
    }
}
