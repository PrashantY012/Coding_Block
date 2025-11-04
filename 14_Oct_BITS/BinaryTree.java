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
public class BinaryTree {

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
    public static void main(String[] args) {
         TreeNode root = new TreeNode(10);
        TreeNode obj2 = new TreeNode(20);
        TreeNode obj3 = new TreeNode(30);
        TreeNode obj4 = new TreeNode(40);

        root.leftChild = obj2;
        root.rightChild = obj3;
    }
}
