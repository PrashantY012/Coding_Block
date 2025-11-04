class Solution {

    int helper(String s1, String s2, int pos1, int pos2, int[][] dp ){
        int n1=s1.length();
        int n2= s2.length();
        //base case
        if(pos1>=n1 || pos2>=n2)return 0;
        if(dp[pos1][pos2]!=-1)return dp[pos1][pos2];


        //cal
        if(s1.charAt(pos1)==s2.charAt(pos2)){
            int ans = 1+ helper(s1,s2,pos1+1,pos2+1,dp);
            return dp[pos1][pos2] = ans;
        }

        int ans1 = helper(s1,s2,pos1+1,pos2,dp);
        int ans2 = helper(s1,s2, pos1,pos2+1,dp);
        return dp[pos1][pos2] = Math.max(ans1,ans2);

    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int [n][m];

        for(int i=0;i<n;i++)for(int j=0;j<m;j++)dp[i][j]=-1;


        return helper(text1,text2,0,0,dp);
    }
}

