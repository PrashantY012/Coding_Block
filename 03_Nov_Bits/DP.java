import java.util.Arrays;

class Solution {
    public int helper(String s1, String s2, int i1, int i2, int [][]dp ){
        int n1= s1.length(), n2= s2.length();
        //base case
        
        if(i1 ==n1 || i2==n2 )return 0;
        if(dp[i1][i2]!=-1)return dp[i1][i2];

        //cal
        int ans=0;
        if(s1.charAt(i1)==s2.charAt(i2)){
             ans = 1+helper(s1, s2, i1+1, i2+1,dp);
            // return dp[i1][i2] = ans;
        }

        int ans1 = helper(s1,s2,i1+1,i2,dp);
        int ans2 = helper(s1,s2,i1,i2+1,dp);
        return dp[i1][i2] = Math.max(ans,Math.max(ans1,ans2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(), n2= text2.length();
        int dp[][]= new int[n1+1][n2+1];
        // Arrays.fill(dp, -1);
        for(int i=0;i<=n1;i++)for(int j=0;j<=n2;j++)dp[i][j]=-1;

        return helper(text1, text2, 0,0,dp);
        
    }
}