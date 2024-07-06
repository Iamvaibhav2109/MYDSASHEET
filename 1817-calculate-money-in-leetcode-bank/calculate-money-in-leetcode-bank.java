class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return (n*(n+1))/2;
        }
        int oneWeekSum=28;
        int weeks=n/7;
        int reminder=n%7;
        int day=(oneWeekSum*weeks)+(7*(weeks-1)*weeks)/2+
               ((reminder*(reminder+1))/2)+weeks*reminder;
        return day;

    }
}