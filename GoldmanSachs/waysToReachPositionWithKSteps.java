class Solution {
    int[][] dp = new int[4001][1001];
    public int numberOfWays(int startPos, int endPos, int k) {
        for(int[] i: dp){
            Arrays.fill(i, -1);
        }
        int ans = count(startPos, endPos, k);
        return ans%1000000007;
    }

    public int count(int curr, int target, int k){
        if(k == 0 && curr == target){
            return 1;
        }
        if(k == 0){
            return 0;
        }
        if(dp[curr + 1000][k] != -1){
            return dp[curr + 1000][k];
        }
        int a = count(curr + 1, target, k - 1);
        a += count(curr - 1, target, k - 1);

        return dp[curr + 1000][k] = a % 1000000007;
    }
}
