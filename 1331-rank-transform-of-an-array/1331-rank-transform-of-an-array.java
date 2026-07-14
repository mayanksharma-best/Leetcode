class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();

        Arrays.sort(arr);
        int[] ans = new int[arr.length];

       HashMap<Integer,Integer> map = new HashMap<>();

        int count = 1;
       for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])) continue;
            map.put(arr[i],count);
            count++;
       }

       for(int j = 0; j<arr.length; j++){
        ans[j] = map.get(temp[j]);
       }

       return ans;
    }
}