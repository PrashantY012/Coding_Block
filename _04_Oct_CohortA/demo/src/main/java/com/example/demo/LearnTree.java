package com.example.demo;

import com.sun.source.tree.Tree;

class TreeNode{
    public int value;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){

    };

    TreeNode(int value){
        this.value = value;
    }
}



public class LearnTree {

    public static void printTree(TreeNode root){

    }
    public static void main(String[] args) {
        /*
        //Make 3 objects/nodes of class TreeNode
        Parent/root -> 10
        left child ->14
        right child->15
        and connect them
        and print child's value from root node
         */

        TreeNode root = new TreeNode();
        root.value = 10;


        TreeNode c1 = new TreeNode();;
        c1.value = 14;

        TreeNode c2 = new TreeNode();
        c2.value =15;

        root.left = c1;
        root.right = c2;

        System.out.println("leftChildIs: "+root.left.value);
        System.out.println("c2: "+root.right.value);


        TreeNode c3 = new TreeNode(16);
        TreeNode c4 = new TreeNode(17);
        TreeNode c5 = new TreeNode(19);

        c1.left = c3;
        c1.right = c4;

        c2.right = c5;

    System.out.println("c3 value is:" +root.left.left.value);
    System.out.println("c4 value is: "+root.left.right.value);

    System.out.println("c5 value is: "+root.right.right.value);




    }
}
