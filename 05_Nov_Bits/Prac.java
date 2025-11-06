import java.util.*;



class Solution {
    public void helper(Set<String>st, int dp[][], String s1, String s2,int i, int j, StringBuilder crnt){
        int  m =dp.length;
        int n =dp[0].length;
        if(crnt.length()==dp[0][0]){
            st.add(crnt.toString());
            return;
        }
        //base case
        if(i>=m || j>=n)return ;

        //cal
        if(s1.charAt(i)==s2.charAt(j)){
            crnt.append(s1.charAt(i));
            helper(st,dp,s1,s2,i+1,j+1,crnt);
            crnt.delete(crnt.length()-1, crnt.length());//check
            return ;
        }

        int maxr = (j==n-1)?-2:dp[i][j+1];
        int maxb = (i==m-1)?-2:dp[i+1][j];
        if(maxr == maxb){
            helper(st,dp,s1,s2,i+1,j,crnt);
            helper(st,dp,s1,s2,i,j+1,crnt);
        }else{
            if(maxr>maxb) helper(st,dp,s1,s2,i,j+1,crnt);
            else helper(st,dp,s1,s2,i+1,j,crnt);
        }


    }
    public List<String> allLCS(String s1, String s2) {
        // code here
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

        Set<String>st= new HashSet<>();
        StringBuilder s= new StringBuilder("");
        helper(st,dp,s1,s2,0,0,s);

        List<String>ans = new ArrayList<>();
        for(String stx: st){
            ans.add(stx.toString());
        }
        Collections.sort(ans);
        return ans;
    }
}


public class Prac{
    public static void main(String args[]){
        StringBuilder s = new StringBuilder("abcde");
        System.out.println(s.delete(4, 5));
    }
}