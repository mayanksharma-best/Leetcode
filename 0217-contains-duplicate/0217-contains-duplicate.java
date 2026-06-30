class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // HashMap<Integer,Integer> mpp = new HashMap<>();
        // Boolean m = false;
        // for(int i=0; i<n; i++){
        //     if(mpp.containsKey(nums[i])){
        //     return true;
        //    }
        //    mpp.put(nums[i],0);
          
        //    }
        //    return m ;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
           Boolean result = set.add(nums[i]);
           if(result == false){
            return true;
           }
        }
        return false;
    }
}
