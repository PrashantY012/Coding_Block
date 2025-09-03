import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrac{
    
    public static void treeMap(){ //user defined function
        //keys are unique, key are stored in sorted order
        //can not contain duplicate keys
        Map<Integer, Integer> hmp = new TreeMap<Integer,Integer>();
        //key-> Integer,String,Float, Double, Obj
        /*
         *  5,6    7,9     0,2     -3,8
         * 
         */
        hmp.put(5,6);//insertion
        hmp.put(7,9);
        hmp.put(0,2);
        hmp.put(-3,8);


        hmp.put(-3,11); //updation

        //find value of key=3

        // hmp.put(7,11);

        hmp.remove(7); //deletion
        System.out.println(hmp);


        System.out.println(hmp.get(-3)); //to get a value corresponding to a key

        //traversing a map
        System.out.println("Printing TreeMap aka sorted map");
        hmp.forEach((key,value)->{
            System.out.println("key: "+key+ "  value: "+value);
        }); 

        /*
         * 
         * hmp.forEach(   
         * 
         * (key, value)-{
         * System.out.println
         * }
         * 
         * 
         * )
         * 
         */

    }


    public static void hashMap(){ //user defined function
        //keys are unique, key are stored in random order
        //can not contain duplicate keys
        Map<Integer, Integer> hmp = new HashMap<Integer,Integer>();
        //key-> Integer,String,Float, Double, Obj
        /*
         *  5,6    7,9     0,2     -3,8
         * 
         */
        hmp.put(5,6);//insertion
        hmp.put(7,9);
        hmp.put(0,2);
        hmp.put(-3,8);


        hmp.put(-3,11); //updation

        //find value of key=3

        // hmp.put(7,11);

        hmp.remove(7); //deletion
        System.out.println(hmp);


        System.out.println(hmp.get(-3)); //to get a value corresponding to a key

        //traversing a map
        System.out.println("Printing Hashmap");
        hmp.forEach((key,value)->{
            System.out.println("key: "+key+ "  value: "+value);
        }); 

        /*
         * 
         * hmp.forEach(   
         * 
         * (key, value)-{
         * System.out.println
         * }
         * 
         * 
         * )
         * 
         */

    }
    public static void main(String args[]){
        hashMap();
        treeMap();
    }
}