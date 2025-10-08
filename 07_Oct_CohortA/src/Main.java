//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
}
public class Main {

    void preOrderTraversal(TreeNode root){
        //base case
        if(root==null)return;
        //cal
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    void inOrderTraversal(TreeNode root){
        //base case
        if(root==null)return;
        //cal
        preOrderTraversal(root.left);
        System.out.println(root.val);
        preOrderTraversal(root.right);

    }

    //do preOrderYourself
    public static void main(String[] args) {

    }
}