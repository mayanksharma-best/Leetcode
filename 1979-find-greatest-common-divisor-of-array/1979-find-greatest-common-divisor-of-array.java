class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int small = nums[0];
        int big = nums[0];

        for(int i : nums){
            small = Math.min(i,small);
            big = Math.max(i,big);
        }

        int ans = 1;
        for(int i = 2; i<= big; i++){
            if(small%i == 0 && big%i == 0){
                ans =  Math.max(i,ans);
            }
        }

        return ans;
    }
}