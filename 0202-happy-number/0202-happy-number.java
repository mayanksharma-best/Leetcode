class Solution {
    public boolean isHappy(int n) {
     
        HashSet<Integer> set = new HashSet<>();
        if(n == 1)
            return true;

        while (n != 1) {
            if(set.contains(n)){
                return false;
            }
            set.add(n);
               int num = 0;
            while (n > 0) {
                int temp = n % 10;
                num += temp * temp;
                n /= 10;
            }

            if(num == 1) return true;
            n = num;
        }

        return false;

    }
}