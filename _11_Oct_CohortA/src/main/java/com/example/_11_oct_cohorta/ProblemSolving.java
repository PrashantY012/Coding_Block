package com.example._11_oct_cohorta;

import com.sun.source.tree.Tree;

class TreeNode{
    int val;
     TreeNode left;
      TreeNode right;
    TreeNode(int val) { this.val = val; }
}
class Solution {


    public int getLargestValue(TreeNode root){  //returns largest value of tree
       if(root == null) return -100000000; //should never happen
        if(root.right == null)return root.val;
        return getLargestValue(root.right);
    }

    public TreeNode deleteLargestNode(TreeNode root){
        if(root== null) return null;
        if(root.right == null){
            return root.left;
        }
        root.right = deleteLargestNode(root.right);
        return root;
    }

    //Step 1-> find the node to be deleted
    public TreeNode deleteNode(TreeNode root, int key) { //alawys return the new root
        //base case
        if(root==null)return null;
        //cal
        if(root.val == key){
            //delete this node
            if(root.left == null)return root.right;
            int largestValue =getLargestValue(root.left);
            root.val = largestValue;  //replacing root.val with largest value of left subtree.
            root.left = deleteLargestNode(root.left);
        }
        if( key  < root.val){
            root.left = deleteNode(root.left, key);// delete the node in left child, and return new root, make connection again.
        }
        else{
            root.right = deleteNode(root.right, key);
        }

        return root;
    }






    /*****************************Insert a  node into BST***************************/
    public TreeNode insertIntoBST(TreeNode root, int val) { //always returns the root/new root of subtree
        //base case
        if(root == null){
            return new TreeNode(val);
        }
        //cal
        if(root.val > val){
            root.left = insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }


}
public class ProblemSolving {
}
