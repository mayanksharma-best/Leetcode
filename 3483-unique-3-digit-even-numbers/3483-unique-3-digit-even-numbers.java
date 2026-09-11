class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int i: digits){
            freq[i]++;
        }
        int count = 0;

        for(int i = 100; i<1000; i = i+2){
            int[] temp = freq.clone();
            int num = i;
            while(num > 0){
                int rem = num % 10;
                if(temp[rem] == 0){
                    count--;
                    break;
                } 
                temp[rem]--;
                num /= 10;  
            }
            count++;
        }

        return count;
    }
}