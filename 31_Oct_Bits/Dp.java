// // import java.util.*;
// // class Solution {

// //     public int helper(int []arr, int crntIndex, int dp[]){
// //         int n= arr.length;
// //         //base case
// //         if(crntIndex>=n)return 0;
// //         if(dp[crntIndex]!=-1)return dp[crntIndex];
// //         //cal
// //         //pick crnt element
// //         int ans1 = arr[crntIndex]+helper(arr,crntIndex+2,dp);

// //         //skip current element
// //         int ans2 = helper(arr,crntIndex+1,dp);
// //         return dp[crntIndex]= Math.max(ans1,ans2);

// //     }
// //     public int rob(int[] nums) {
// //         int n= nums.length;
// //         int []dp =  new int[n];
// //         for(int i=0;i<n;i++){
// //             dp[i]=-1;
// //         }
// //         return helper(nums, 0,dp);
// //     }
// // }



// class Solution {
//     long helper(int arr[], long target, long index, long sum, long dp[][]){
//         //base case
//         if(target == sum)return 0;
//         if(index>=arr.length)return 10000000; //think
//         if(sum>target)return 100000000;
//         if(dp[index][sum]!= (long)-1)return dp[index][(int)sum];

//         //cal
//         //pick it
//         long ans1 =  1+helper(arr,target, index,sum+arr[index],dp);
//         //dont pick it
//         long ans2 = helper(arr, target, index+1, sum,dp);
//         return dp[index][(int)sum] =   Math.min(ans1,ans2);

//     }
//     public int coinChange(int[] coins, int amount) {
//         int n =coins.length;

//         long [][] dp = new long[n][amount+1];
//         for(int i=0;i<n;i++)for(int j=0;j<=amount;j++)dp[i][j]=-1;

//             long ans= helper(coins, amount, 0, 0,dp); 
//             if(ans > 1000000)return -1;
//             return (int)ans;
//     }
// }




class Solution {
    public void fillPrefixSuffix(int arr[], String pattern){
        int i= 1, len= 0;
        int n = arr.length;

        while(i<n){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                arr[i]=len;
                i++;
            }else{
                if(len==0){
                    //no issues
                    arr[i]=len;
                    i++;
                }else{
                    len = arr[len-1];
                }
            }
        }
    }
    public int strStr(String text, String pattern) {
        int plen= pattern.length();
        int preSuf[]=  new int[plen];
        fillPrefixSuffix(preSuf, pattern);
        int ans=-1;
        int n = text.length();
        int j=0;
        int i=0;
        while(i < n ){
            if(text.charAt(i) == pattern.charAt(j)){
                j++;
                i++;
                if(j == pattern.length()){
                    return i-plen;
                }
            }else{
               if(j==0){
                   i++;
               }else{
                   j = preSuf[j-1];
               }
            }
        }
        return ans;
    }
}

