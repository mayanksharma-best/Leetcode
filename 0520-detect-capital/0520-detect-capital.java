class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        boolean flag = false;
        int capital = 0;
        int lower = 0;
        for(int i = 0; i<n; i++){
            char ch = word.charAt(i);
            
            if(i == 0 && ch>= 65 && ch<=90){
                flag = true;
            }
            if(ch>= 65 && ch<= 90){
                capital++;
            }
            else{
                lower++;
            }
        }

        if(capital == n) return true;
        if(capital == 1 && flag) return true; 
        if(lower<n) return false;
        else return true;
    }
}