import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int helper(int[]nums, int crntInd, HashMap<Integer, Integer>hm, int []dp){
        int len = nums.length;
        //base case
        if(crntInd>=len)return 0;
        if(crntInd == len-1){
            return nums[crntInd];
        }
        if(dp[crntInd]!=-1)return dp[crntInd];
        // if(hm.containsKey(crntInd))return hm.get(crntInd);
        //cal
        //pick the element
        int ans1 = nums[crntInd]+helper(nums, crntInd+2,hm,dp);

        //dont pick
        int ans2 = helper(nums,crntInd+1,hm,dp);
        int ans = Math.max(ans1,ans2);
        dp[crntInd]=ans;

    
        // hm.put(crntInd, ans);
        return ans;
        
    }
    public int rob(int[] nums) {
        HashMap<Integer, Integer>hm= new HashMap<>();
        int arr[]= new int[nums.length];
        Arrays.fill(arr,-1);
        return helper(nums,0, hm,arr);
    }
}