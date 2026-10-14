class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        return fun(n,dp);
    }
    int fun(int n, int dp[]){
        if(n==0)return 1;
        if(n==1)return 1;
        if(dp[n]!=0)return dp[n];
        return dp[n]=fun(n-1,dp)+fun(n-2,dp);
    }
}