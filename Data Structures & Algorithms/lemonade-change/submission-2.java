class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fives++;                    // no change needed
            } else if (bill == 10) {
                if (fives == 0) return false;
                fives--;                    // give $5 change
                tens++;
            } else {                        // bill == 20
                if (tens > 0 && fives > 0) {
                    tens--;                 // give $10 + $5 (preferred)
                    fives--;
                } else if (fives >= 3) {
                    fives -= 3;             // give three $5
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}