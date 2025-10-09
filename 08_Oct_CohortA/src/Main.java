import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


     public class TreeNode {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ansList = new ArrayList<>();
            if(root == null) return ansList;

            Queue<TreeNode> currentLvl = new LinkedList<>(); //to print/store the nodes
            Queue<TreeNode> futureLvl = new LinkedList<>(); //to store future/child nodes

            currentLvl.add(root);

            while(!currentLvl.isEmpty()){

                //traverse on current level, print/store ans and store futureLvl/child level
                List<Integer> currentLevelAns = new ArrayList<>();

                while(!currentLvl.isEmpty()){
                    TreeNode currentNode = currentLvl.remove();
                    currentLevelAns.add(currentNode.val);


                    //storing next level
                    if(currentNode.left != null)
                        futureLvl.add(currentNode.left);

                    if(currentNode.right!=null)
                        futureLvl.add(currentNode.right);
                }


                //adding ans to final ans list
                ansList.add(currentLevelAns);
                //swapping current and future  queues/arrays
                Queue<TreeNode> temp =  futureLvl;
                futureLvl = currentLvl;
                currentLvl = temp;
            }
        return ansList;
        }




        public TreeNode searchBST(TreeNode node, int val) {
                    //base case
            if(node == null)return null;
            if(node.val == val)return node;
            //cal
            if(val>node.val){
                return searchBST(node.right, val);
            }else{
                return searchBST(node.left, val);
            }
        }
    }
    public static void main(String[] args) {

    }
}