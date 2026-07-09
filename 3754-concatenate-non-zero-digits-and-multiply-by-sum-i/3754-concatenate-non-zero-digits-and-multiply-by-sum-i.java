class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int a = n%10;
            list.add(a);
            n /= 10;
        }

        Collections.reverse(list);

        long sum = 0;
        long num = 0;
        for(int a : list){
            if(a>0){
                num += a;
                num *= 10;
                sum += a;
            }

        }

        return (num*sum)/10;
    }
}