import java.util.List;

public class Dp {
    //write a recursive function to get nth number of a fibonacci series

    public static int  getNthFibo(int n, int dp[]){
        if(n==1)return 0;
        if(n==2)return 1;
        if(dp[n]!=-1)return dp[n];

        int ans = getNthFibo(n-1,dp)+getNthFibo(n-2,dp);
        dp[n]=ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 100;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=-1;

        System.out.print(getNthFibo(n,dp));
    }
}


class Solution {
    public int isEulerCircuit(int n, List<Integer>[] adj) {
        // code here
        for(int i=0;i<adj.length;i++){
            
        }

        return 0;
        
    }
}
