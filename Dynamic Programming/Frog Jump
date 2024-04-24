#include <bits/stdc++.h> 
int difference(int n,int m){
    if(m>=n)
    return m-n;
    else
    return n-m;
}
int frog(int n,vector<int> &heights,int dp[]){
    if(dp[n]!=-1) return dp[n];
    if(n==0){
        return 0;
    }
    int left=frog(n-1,heights, dp)+difference(heights[n-1],heights[n]);
    int right=INT_MAX;
    if(n>1)
    right=frog(n-2,heights, dp)+difference(heights[n-2],heights[n]);
    dp[n]=min(left,right);
    return dp[n];
}
int frogJump(int n, vector<int> &heights)
{
    int dp[n];
    for(int i=0;i<n;i++)
    dp[i]=-1;
    return frog(n-1,heights,dp);
}
