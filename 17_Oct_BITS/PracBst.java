
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public int getMinInBst(TreeNode root){
        if(root == null)return -1;//must never happen
        if(root.left == null)return root.val; //this is the min value
        return getMinInBst(root.left);
    }

    public TreeNode deleteMinNode(TreeNode root){ //returns updated root of subtree
        if(root==null)return null;//should not happen
        if(root.left == null)return root.right;//this is the min node, delete it
        root.left = deleteMinNode(root.left);
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        //check if node exist or not
        //base case
        if(root == null) return null;
        //cal
        if(root.val ==key){
            //now we need to delete this node
            //if this node is leaf or already minimum one...easy
            if(root.left == null)return root.right;
            if(root.right == null)return root.left;//no children on right side
            int minNode= getMinInBst(root.right);
            root.val = minNode;
            root.right = deleteMinNode(root.right);
            return root;
        }

        if(key>root.val){
            root.right = deleteNode(root.right,key );  //connecting with new subtree root, if it changes
        }else{
            root.left = deleteNode(root.left, key);
        }
        return root;

    }
}