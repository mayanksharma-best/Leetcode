class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int[] result = new int[nums.length];

        for(int k = 0; k<nums.length; k++){
            if(nums[k] % 2 == 0){
                result[i] = nums[k];
                i++;
            }
            else{
                result[j] = nums[k];
                j--;
            }
        }
        return result;
    }
}