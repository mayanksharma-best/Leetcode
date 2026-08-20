class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = 0;
        boolean flag = false;
        int count = 0;
    
        for(int i : nums){
            if(i == Integer.MIN_VALUE && flag == false){
                count++;
                flag = true;
            }
            if(i != max && i != secondMax && i != thirdMax){
                count++;
            }
            if(i > max){
                thirdMax = secondMax;
                secondMax = max;
                max = i;
                // flag = true;
                
            }
            if(i < max && i > secondMax){
                thirdMax = secondMax;
                secondMax = i;
                // flag = true;
            }
            if(i < max && i < secondMax && i >= thirdMax){
                thirdMax = i;
                // flag = true;
            }
        }

        // if(n < 3) return max;

        return count >= 3 ? thirdMax : max;
    }
}