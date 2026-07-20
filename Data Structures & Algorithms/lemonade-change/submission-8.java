class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        
        for(int n : bills){
            if(n==5){
                fives++;
            }
            else if(n==10 && fives>0){
                tens++;
                fives--;
            }
            else if(n==20 && fives>=3){
                fives-=3;
            }
            else if(n==20 && fives>0 && tens>0){
                fives--;
                tens--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}