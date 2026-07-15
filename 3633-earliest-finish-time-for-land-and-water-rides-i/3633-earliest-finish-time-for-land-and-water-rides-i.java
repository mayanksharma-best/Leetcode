// Approach : ek land aur ek water ride karani h minimum time me order kch bhi ho .
// koi bhi ek land ride lelo uske baad usko saari water ride ke saath karke mini lelo 
// same ab pehle water lelo uske saath saari land ride lelo 
// Complexity : 2 * (n*m);


class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int n = landDuration.length;
        int m = waterDuration.length;

        int res = 0;
        int mini = Integer.MAX_VALUE;

        // LandRide pehle li uske baade waterRide saari check ki 
        for(int i = 0; i<n; i++){
            int landRide = landStartTime[i] + landDuration[i];

            for(int j = 0; j<m; j++){
                 res = (Math.max(landRide , waterStartTime[j]) + waterDuration[j]);
                 mini = Math.min(res , mini);
            }

            
        }

        // WaterRide pehli li uske baad saari landRide li 

        for(int i = 0; i<m; i++){
            int waterRide = waterStartTime[i] + waterDuration[i];

            for(int j = 0; j<n; j++){
                 res = (Math.max(waterRide , landStartTime[j]) + landDuration[j]);
                 mini = Math.min(res , mini);
            }

            
        }

        return mini;

    }
}