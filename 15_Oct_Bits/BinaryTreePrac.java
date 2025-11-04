import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode rightChild;
    TreeNode leftChild;

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(){
        //Not default
        //custom constructor with no arguments
        //no args constructor
    }
}


public class BinaryTreePrac {

    public static int getSizeOfTree(TreeNode root){
        //base case
        //when we are on leaf node---> for case//try yourself
        //when we are on null
        if(root==null){
            return 0;
        }
        //calculation
        int leftSubTreeSize = getSizeOfTree(root.leftChild);
        int rightSubTreeSize = getSizeOfTree(root.rightChild);
        return leftSubTreeSize+rightSubTreeSize+1;
    }

    public static int getHeightOfTree(TreeNode root){
        //base case
        if(root == null)return 0; 

        //calculation
        int heightOfLeftSubtree = getHeightOfTree(root.leftChild);
        int heightOfRightSubtree = getHeightOfTree(root.rightChild);
        int ans = Math.max(heightOfLeftSubtree, heightOfRightSubtree)+1;
        return ans;

    }

    public void preOrderTravsersal(TreeNode root){ //print the nodes in preorder traversal
        //base case
        if(root==null)return;
        //calculation
        System.out.println(root.val);
        preOrderTravsersal(root.leftChild);
        preOrderTravsersal(root.rightChild);
    }

    public void postOrderTraversal(TreeNode root){
        //base case
        if(root == null)return ;
        //cal
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.val);
    }



    public static int getHeight(TreeNode root){
        //base case
        if(root == null)return 0;
        //calculation
        return Math.max(getHeight(root.leftChild), getHeight(root.rightChild))+1;
    }

    public static void getDiametreLengthHelper(TreeNode root, ArrayList<Integer>arr){
        //base case
        if(root ==null){
            return;
        }
        //cal
        int maxPathOnLeft = getHeight(root.leftChild);
        int maxPathOnRight = getHeight(root.rightChild);
        int onePossibleAns = maxPathOnLeft+maxPathOnRight+1;
        getDiametreLengthHelper(root.leftChild, arr);
        getDiametreLengthHelper(root.rightChild, arr);
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

        root.leftChild = obj2;
        root.rightChild = obj3;

        obj2.rightChild = obj5;
        obj5.leftChild = obj6;
        obj5.rightChild = obj7;

        obj3.rightChild = obj4;

        System.out.println(getDiametreLength(root));
    }
}
