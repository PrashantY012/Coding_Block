public class RecAdv{

    public int helper(int row, int col, int r, int c){
        //base case
        if(r == row || c == col){
            return 0;
        }
        if(r == row-1 && c== col-1){
            return 1;
        }
        //cal
        int ans1 = helper(row,col,r,c+1);  //when moving right
        int ans2 =  helper(row,col,r+1, c); //when moving bottom
        return ans1+ans2;
    }


     public int uniquePaths(int m, int n) {
       return  helper(m,n,0,0);
    }

    //toFindChar--> the positon where we are, is it equal to toFindChar
        boolean wordHelper(char[][] board, String word,int r, int c, int toFindCharInd,int track [][]){
            int row = board.length;
            int col = board[0].length;
            //base case
            if(r>=row || c>= col){
                return false;  //will see
            }
            if(board[r][c] != word.charAt(toFindCharInd)){
                return false;
            }
            if(track[r][c] == 1){ //we will not consider already marked elements
                return false;
            }

            track[r][c]=1;
            //calculation
            boolean a1 = wordHelper(board, word, r-1, c, toFindCharInd+1,track); //top
            boolean a2 = wordHelper(board,word,r, c+1, toFindCharInd+1,track); //right
            boolean a3 = wordHelper(board,word,r+1, c, toFindCharInd+1,track); //bottom
            boolean a4 = wordHelper(board,word,r, c-1, toFindCharInd+1,track); //left
            
            if(a1 || a2 || a3 || a4){
                return true;  // return (a1|a2|a3|a4);
            }
            return false;
            






        }

     bool exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int track [][] = new int[row][col];


        
    }
    public static void main (String args[]){
            uniquePaths(2,3);
    }

}