import java.util.HashMap;
import java.util.Map;



public class MapPracc {
    class temp{
        public String string;
    }
    public static void main(String[] args) {
        
        // Create a Map using HashMap
        Map<String, Integer> m = new HashMap<>();
        // temp ta = new temp();
        int a  = new int(5);

        // Adding key-value pairs to the map
        m.put("ape", 1);
        m.put("dog", 2);
        m.put("cat", 3);

        System.out.println("Map elements: " + m);
    }
}