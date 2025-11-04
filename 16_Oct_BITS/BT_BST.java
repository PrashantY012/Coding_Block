import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ansArray  = new ArrayList<>();
        if(root == null)return ansArray;
        Queue<TreeNode>qu =new LinkedList<>(); //this will store current and future level;
        qu.add(root);

        while(!qu.isEmpty()){ //has our traversal completed

            int size = qu.size();
            List<Integer>currentLvl = new ArrayList<>();//this will store current level of nodes

            for(int i=0;i<size;i++){
                TreeNode crntNode = qu.remove();
                currentLvl.add(crntNode.val);

                if(crntNode.left!=null)
                qu.add(crntNode.left);

                if(crntNode.right!=null)
                qu.add(crntNode.right);
            }
            ansArray.add(currentLvl);
        }

        return ansArray;
    }


     public TreeNode searchBST(TreeNode root, int val) {
        //base case
        if(root==null)return null;
        //calculation
        if(root.val == val)return root;
        if(val < root.val){
            return searchBST(root.left, val);
        }
        else{
            return searchBST(root.right, val);
        }
        
    }

     public TreeNode insertIntoBST(TreeNode root, int val) {
        //base case
        if(root == null){
            return new TreeNode(val);
        }
        //cal
        if(val> root.val){
            TreeNode newRightChild = insertIntoBST(root.right, val);
            root.right = newRightChild;
        }
        else{
            TreeNode newLeftChild = insertIntoBST(root.left, val);
            root.left = newLeftChild;
        }
        return root;
    }
}



public class BT_BST{
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        Stream<Integer> str = ls.stream();
        // System.out.println(str.count());
        // ls.forEach((x)->{
        //     /*
        //      * 
        //      * 
        //      */
        //     System.out.println(x*2);
        // });

        // ls.stream().
        // filter(x-> {
        //     System.out.println("Inside filter: "+x);
        //     return x%2==0;})
        //     .map(x->{
        //         System.out.println("Inside map: "+x);
        //         return 2*x;})
        //     .forEach(x->System.out.println(x));

        // List<String> words = List.of("apple", "banana", "orange");
        // String s ="ssad";
        // List<String> upper = words.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        // upper.forEach(x->System.out.print(x+" "));


        // List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        // List<Integer> even = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        // even.forEach(x->System.out.print(x+" "));


        // List<String> names = List.of("John", "Jane", "Jack", "Emily");
        // String st = names.stream().filter(x->x.startsWith("J")).findFirst().orElse("Not Found");
        // System.out.println("string is: "+ st);
        

        // String s1 = "Hello";
        // String s2 = "Helle Loo Yaah";
        // System.out.println(s1>s2);


        List<String> cities = List.of("London", "Paris", "New York", "Berlin");

        // List<String> lamda = cities.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // lamda.forEach(x->System.out.print(x+ "  "));


        // List<Integer> nums = List.of(12, 45, 2, 90, 33);
        // Integer largest = nums.stream().reduce(0,(c,e)->{
        //     if(c<e)return e;
        //     return c;
        // });
        // System.out.println(largest);


        // List<String> words = List.of("a", "ab", "abc", "de", "fg", "hij");

        // Map<Integer, ArrayList<String>> mp = words.stream().collect(Collectors.toMap(s->s.length(), s->new ArrayList<>(Arrays.asList(s)),(ex, current)->{ex.addAll(current);return ex; } ));
        // System.out.println(mp);

        String input = "banana";

        Map<Character, Integer> mp = input.chars()
            .mapToObj(c -> (char) c)    
            .collect(Collectors.toMap(ch->ch, ch->1,(ex, newOne)->ex+1));

            System.out.print(mp);

    }
}