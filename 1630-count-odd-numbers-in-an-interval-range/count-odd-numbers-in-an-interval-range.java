class Solution {
    public int countOdds(int low, int high) {
        int oddsOnhigh=(high+1)/2;
        int oddsOnLow=low/2;
        return oddsOnhigh-oddsOnLow;
    }
}