class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int n = 1;
        while(uniqueCnt1 != 0 && uniqueCnt2 != 0){
            if(n % divisor1 != 0){
                uniqueCnt1--;
            }
            else if(n % divisor2 != 0){
                uniqueCnt2--;
            }
            n++;
        }
        while( uniqueCnt1 != 0){
            if(n % divisor1 != 0){
                uniqueCnt1--;
            }
            n++;
        }
        while( uniqueCnt2 != 0){
            if(n % divisor2 != 0){
                uniqueCnt2--;
            }
            n++;
        }

        return n - 1;
    }
}
