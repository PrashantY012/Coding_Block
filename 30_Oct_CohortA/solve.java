public class solve{


    static int getNthFibo(int n, int []dp){
        //base case
        if(n ==1)return 0;
        if(n==2)return 1;
        if(dp[n]!=-1)return dp[n];

        //cal
        int ans=  getNthFibo(n-1,dp)+getNthFibo(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public static void main(String[] args) {
        
        int n = 50;
        int dp[] = new int[n];
        for(int i=0;i<n;i++)dp[i]=-1;
        System.out.println(getNthFibo(50,dp));
        
    }

}

class Solution {

    public int helper(int x, int top, int []dp){
        //base case
        if(x>top)return 0;
        if(x ==  top) return 1;
        if(dp[x]!=-1)return dp[x];

        //calculation
        int ans1 = helper(x+1,top,dp);
        int ans2 = helper(x+2,top,dp);
        return dp[x]= ans1+ans2;

    }
    public int climbStairs(int n) {
        int dp[]= new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=-1;
        return helper(0,n,dp);
    }
}