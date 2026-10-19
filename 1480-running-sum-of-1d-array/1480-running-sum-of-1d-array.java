class Solution {
    public int[] runningSum(int[] nums) {
        int n =  nums.length;
        int[] result = new int[n];
        int sum = 0;

        int k = 0;
        for(int i:nums){
            sum += i;
            result[k] = sum;
            k++;
        }

        return result;
    }
}