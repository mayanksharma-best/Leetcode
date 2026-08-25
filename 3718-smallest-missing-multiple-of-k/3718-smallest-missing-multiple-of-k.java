class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp = k;

        for(int i : nums){
            map.put(i,0);
        }

        for(int i : nums){
            if(map.containsKey(temp)){
                temp += k;
            }
            if(!map.containsKey(temp)){
                return temp;
            }
        }
        return -1;

    }
}