class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0, mul = 1;
        while(temp != 0){
            int dig = temp %10;
            sum += dig;
            mul *= dig;
            temp /= 10;
        }

        return mul-sum;
    }
}