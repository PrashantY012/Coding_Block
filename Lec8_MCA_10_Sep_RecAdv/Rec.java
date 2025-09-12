public class Rec{

    //returns if there exists a string S[ind....last] in matrices from position r,c
    //including the element present at r,c.
    public boolean helper(char[][]board, String word, int r, int c, int ind, int [][]track){
        int row = board.length;
        int col = board[0].length;
        //base case

        //when r>= row || c>=col
        if(r>=row || c>=col || r<0 || c<0){
            return false;
        }

        if(track[r][c]==1){
            return false;
        }

        if(word.charAt(ind)!= board[r][c] ){
            return false;
        }
        if(ind == (word.length()-1)){
            return true;
            
            // if(ind == word.length()){
        //     return true;
        // }
        }


        //cal
        track[r][c] = 1;
        boolean a1 = helper(board, word, r-1, c,ind+1,track); //top call
        boolean a2 = helper(board, word,r, c+1,ind+1,track); //right call
        boolean a3 = helper(board,word,r+1,c,ind+1,track); //bottom
        boolean a4 = helper(board, word, r, c-1,ind+1,track);//left call
        track[r][c]=0;
        if(a1 || a2 || a3 || a4){
            return true;
        }
        return false;
        
    }
    
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int track[][] = new int[row+1][col+1];
        for(int i=0;i<row;i++)for(int j=0;j<col;j++)track[i][j]=0; //initialising track matrices
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]== word.charAt(0)){
                    boolean ans = helper(board, word,i,j,0,track );
                    if(ans)return true;
                }
            }
        }
        return false;
    }

    public static void main(String []main){

    }


}