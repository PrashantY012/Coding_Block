public class MatriceRec{
    //given a 2D array find sum of all its elements using recursion.
    public static int getSumRecHelper(int arr[][], int r, int c){ //r--> current elements row no, c-->currrent elements column no
        int row = arr.length;
        int col = arr[0].length;
        //base case
        if( r == row-1 && c == col-1){
            return arr[r][c];
        }

        //cal
        int ans = 0;
        if(c<(col-1)){
        ans =arr[r][c]+ getSumRecHelper(arr, r,c+1 );
        }else{
            ans = arr[r][c]+getSumRecHelper(arr, r+1,0 );
        }
        return ans;
    }
    public static int getSumUsingRec(int arr[][]){

        return getSumRecHelper(arr,0,0 );
    }
    /*
     *  int arr [][] = 
        {{1,2,3,4},
        {7,8,6,9},
        {10,12,11,5}
        };
     */


    public static void printTraversal(int [][]arr){
        int row = arr.length;
        int col = arr[0].length ; 



        //row traversal
        for(int i= 0;i< row;i++){
            for(int j =0 ;j<col ;j++){
                System.out.print("  row: "+i+ "  col:"+j+ "  ele:"+ arr[i][j]);
            }
            System.out.println();
        }


         //col traversal
         System.out.println();
        for(int j= 0;j<col ;j++){
            for(int i =0 ;i< row;i++){
                System.out.print("  row: "+i+ "  col:"+j+ "  ele:"+ arr[i][j]);
            }
            System.out.println();
        }


    }
    public static void main(String []args){
        int arr [][] = 
        {{1,2,3,4},
        {7,8,6,9},
        {10,12,11,5}
        };

        int arr2 [][] ={
            {1,2,3,4}
        };
        // printTraversal(arr);
        System.out.println("array sum is: "+getSumUsingRec(arr));
    }


}