import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class LearnMap {


    public static void hashmap(){
        HashMap<Integer, Integer> mp = new HashMap <Integer, Integer>();
        mp.put(1,10);
        mp.put(2, 11);
        mp.put(3, 12);
        mp.put(4,13);

        System.out.println("Map Content is: "+ mp);
        mp.put(3,17);
        System.out.println("Map Content is: "+ mp);

        mp.remove(3);

        //traversing a map, like we traverse an array

        //using Map.entry
        for(HashMap.Entry<Integer, Integer> entry:mp.entrySet()){ 
            System.out.println("key: "+entry.getKey()+ "   value:"+ entry.getValue());
        }


        //using for each
        mp.forEach((key,value)->{
            System.out.println("Key: "+key+ "  value: "+value);
        });
            


    }
    public static void main(String args[]){

        hashmap();
    }
    
}
