import java.util.Arrays;
import java.util.*;

public class DP{
     public int helper(int n, int []dp){
        if(n==1)return 0;
        if(n==2)return 1;
        if(dp[n]!=-1)return dp[n];

        return dp[n]= helper(n-1,dp)+helper(n-2,dp);
    }

    public int getNthFiboRec(int n){
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n, dp);
    }


    public int getNthFiboBottom(int n){
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        dp[1]=0;dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
public static void main(String[] args) {

   
    
}

}


// User function Template for Java

class Solution {
    public List<String> allLCS(String s1, String s2) {
        // Code here
        int m = s1.length();
        int n = s2.length();
        int dp[][]= new int[m][n];

        //populate
        if(s1.charAt(m-1)==s2.charAt(n-1))dp[m-1][n-1]=1;
        for(int i=n-2;i>-1;i--){
            if(s2.charAt(i)==s1.charAt(m-1)){
                dp[m-1][i]= 1;
            }else{
                dp[m-1][i]= dp[m-1][i+1];
            }
        } 

        //populate last column

        for(int i=m-2;i>-1;i--){
             if(s2.charAt(n-1)==s1.charAt(i)){
                dp[i][n-1]= 1;
            }else{
                dp[i][n-1]= dp[i+1][n-1];
            }
        }

        //fill dp
        for(int i=m-2;i>-1;i--){
            for(int j=n-2;j>-1;j--){

                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]= 1+dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }

            }
        }
        return dp[0][0];
    }
}