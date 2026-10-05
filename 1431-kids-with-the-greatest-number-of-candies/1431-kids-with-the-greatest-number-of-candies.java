class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        
        int n = candies.length;

        int maxi = -1;

        for(int i : candies){
            if(maxi < i) maxi = i;
        }

        for(int i : candies){
            if(extraCandies + i >= maxi){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
    
            return ans;
    }
}