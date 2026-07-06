class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
           if(a[0] != b[0])  return a[0] - b[0];

           else{
            return b[1] - a[1];
           }
        });

        int maxRight = 0;
        int count = 0;

       for(int[] arr : intervals){
            if(arr[1] <= maxRight){
                count++;
            }
            
            if(maxRight < arr[1]){
                maxRight = arr[1];
            }
       } 

       return (intervals.length - count);

    }
}