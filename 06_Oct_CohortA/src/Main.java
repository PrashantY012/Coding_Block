

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.sun.source.tree.Tree;

import java.util.ArrayList;

import static java.lang.Math.max;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(){

    }
}


public class Main {

    //Height of tree = height of subtree+1
    //height of tree = max(height of left subtree, height of right subtree)+1;
    static int getHeightOfTree(TreeNode root){
        //base casey
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){//think we dobt beed this
            return 1;
        }
        //cal
        int leftSubTreeHeight = getHeightOfTree(root.left);//returns left subtree height
        int rightSubTreeHeight = getHeightOfTree(root.right);
        int currentTreeHeight = max(leftSubTreeHeight,rightSubTreeHeight)+1;
        return currentTreeHeight;
    }

    //find maximum value in a binary tree
    public static int getMaxValue(TreeNode root){ //if values are negative also.....hint return really low value
    //base case
        if(root == null){
            return 0;
        }
        int leftMax = getMaxValue(root.left);
        int rightMax = getMaxValue(root.right);
        int ans = max(root.val, max(leftMax,rightMax));
        return ans;
    }

    //find left subtree's height, find right subtree's heigh
    // , calculate max diametre of including current node
    public static int getDiametreHelper(TreeNode root, ArrayList<Integer>allDia, Integer maxDia){
        if(root==null)return 0;
        int leftHeight = getDiametre(root.left);
        int rightHeight = getHeightOfTree(root.right);
        int currentDia = leftHeight+rightHeight+1;
//        allDia.add(currentDia);
        maxDia = max(maxDia, currentDia);
        return max(leftHeight,rightHeight)+1;
    }

    public static int getDiametre(TreeNode root){ //count no of nodes in the diametre
        //1st option--> store all diamtre in an list and then find maximum
        return 0;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        TreeNode c1 = new TreeNode(2);
        TreeNode c2 = new TreeNode(3);
        TreeNode c3 = new TreeNode(60);
        TreeNode c4 = new TreeNode(72);
        TreeNode c5 = new TreeNode(91);

        root.left = c1;
        root.right = c2;

        c1.right = c3;

        c3.left =c4;

        c2.left = c5;

        System.out.println("Height of tree is: "+getHeightOfTree(root));


    }
}