import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(){
        //Not default
        //custom constructor with no arguments
        //no args constructor
    }
}


public class LeetCode {

    public static int getSizeOfTree(TreeNode root){
        //base case
        //when we are on leaf node---> for case//try yourself
        //when we are on null
        if(root==null){
            return 0;
        }
        //calculation
        int leftSubTreeSize = getSizeOfTree(root.left);
        int rightSubTreeSize = getSizeOfTree(root.right);
        return leftSubTreeSize+rightSubTreeSize+1;
    }

    public static int getHeightOfTree(TreeNode root){
        //base case
        if(root == null)return 0; 

        //calculation
        int heightOfLeftSubtree = getHeightOfTree(root.left);
        int heightOfRightSubtree = getHeightOfTree(root.right);
        int ans = Math.max(heightOfLeftSubtree, heightOfRightSubtree)+1;
        return ans;

    }

    public void preOrderTravsersal(TreeNode root){ //print the nodes in preorder traversal
        //base case
        if(root==null)return;
        //calculation
        System.out.println(root.val);
        preOrderTravsersal(root.left);
        preOrderTravsersal(root.right);
    }

    public void postOrderTraversal(TreeNode root){
        //base case
        if(root == null)return ;
        //cal
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }



    public static int getHeight(TreeNode root){
        //base case
        if(root == null)return 0;
        //calculation
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    public static void getDiametreLengthHelper(TreeNode root, ArrayList<Integer>arr){
        //base case
        if(root ==null){
            return;
        }
        //cal
        int maxPathOnLeft = getHeight(root.left);
        int maxPathOnRight = getHeight(root.right);
        int onePossibleAns = maxPathOnLeft+maxPathOnRight+1;
        getDiametreLengthHelper(root.left, arr);
        getDiametreLengthHelper(root.right, arr);
        arr.add(onePossibleAns);
    }

    public static int getDiametreLength(TreeNode root){
        ArrayList<Integer>arr = new ArrayList<>();
        getDiametreLengthHelper(root, arr);
        int ans =0;
        for(int x: arr){
            ans = Math.max(ans, x);
        }
        return ans;
    } 


    public static void main(String[] args) {
         TreeNode root = new TreeNode(4);
        TreeNode obj2 = new TreeNode(5);
        TreeNode obj3 = new TreeNode(6);
        TreeNode obj4 = new TreeNode(7);
        TreeNode obj5 = new TreeNode(8);
        TreeNode obj6 = new TreeNode(9);
        TreeNode obj7 = new TreeNode(10);

        root.left = obj2;
        root.right = obj3;

        obj2.right = obj5;
        obj5.left = obj6;
        obj5.right = obj7;

        obj3.right = obj4;

        System.out.println(getDiametreLength(root));
    }
}
