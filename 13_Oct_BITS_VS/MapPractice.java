
import java.util.HashMap;
import java.util.Map;

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
public class MapPractice {
    public static void pracMap(){
         HashMap<String, Integer> petCount = new HashMap<>();

        //insert
        //ape 1, dog 2, frog 3, cat 7

        petCount.put("ape",1);
        petCount.put("dog",2);
        petCount.put("frog",3);
        petCount.put("cat", 4);

        System.out.print(petCount);

        //print in this format
        //pet name is :dog and it count it: 3
        //traversal
        for(String key: petCount.keySet()){
            System.out.println("pet name is:"+key);
        }
        
        for(Integer val: petCount.values()){
            System.out.println("pet count is:"+val);
        }

        for( Map.Entry<String,Integer> pair: petCount.entrySet()){
            System.out.println("petname is: "+pair.getKey()+ " and its count is: "+pair.getValue());
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        TreeNode obj2 = new TreeNode(20);
        TreeNode obj3 = new TreeNode(30);
        TreeNode obj4 = new TreeNode(40);

        root.leftChild = obj2;
        root.rightChild = obj3;

        obj3.rightChild = obj4;

        //connection established???????????

        System.out.println("obj2's value: "+root.leftChild.val);

        System.out.println("obj 4's value: "+root.rightChild.rightChild.val);


    }
}
