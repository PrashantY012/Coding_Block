public class AdvRec {

    // Find sum of a 2D array using recursion

    public static int getSumRec(int arr[][], int r, int c) {
        int row = arr.length;
        int col = arr[0].length;
        // base case
        if (r == row - 1 && c == col - 1) {
            return arr[r][c];
        }

        // calculation
        int ans = 0;
        if (c < col - 1) {
            ans = arr[r][c] + getSumRec(arr, r, c + 1);// going right
        } else {
            ans = arr[r][c] + getSumRec(arr, r + 1, 0); // going down
        }
        return ans;

    }

    public static int getSum(int arr[][]) {
        return getSumRec(arr, 0, 0);
    }


    public static int uniquePathsRec(int row, int col, int r, int c, int dp[][]) {
        // base case
        if (c >= col || r >= row) {
            return 0;
        }
        if (r == row - 1 && c == col - 1) {
            return 1;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        // cal
        int ans1 = uniquePathsRec(row, col, r, c + 1,dp); // move on right element
        int ans2 = uniquePathsRec(row, col, r + 1, c,dp);// move on bottom element
        return dp[r][c]= ans1 + ans2;

    }

    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m;i++)for(int j=0;j<n;j++)dp[i][j]=-1;
        return uniquePathsRec(m, n, 0, 0,dp);
    }

    // find all paths in a grid, Lc No 62
    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println("Sum of 2D array is: " + getSum(arr));
    }

}